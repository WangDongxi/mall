package com.xydq.mall.core.biz;

import com.xydq.mall.core.dto.LoginDTO;
import com.xydq.mall.core.redis.UserLoginCache;
import com.xydq.mall.user.dao.domain.MallUser;
import com.xydq.mall.user.service.MallUserService;
import com.xydq.mall.utils.CharUtil;
import com.xydq.mall.utils.exception.MallException;
import com.xydq.mall.utils.encrypt.EncryptUtil;
import com.xydq.mall.utils.validate.MobileValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wanghuaidong
 * @date 2020/4/4
 */
@Service
public class MallUserBizService {

    private static final Integer TOKEN_LENGTH = 32;
    @Autowired
    private UserLoginCache userLoginCache;
    @Autowired
    private MallUserService mallUserService;

    public LoginDTO register(String mobile, String password) {
        if (!MobileValidate.isPhone(mobile)) {
            throw new MallException("请输入正确的手机号码");
        }
        MallUser mallUser = mallUserService.selectByMobile(mobile);
        if (mallUser != null) {
            throw new MallException("手机号码已存在，请使用其他手机号码");
        }
        String encryptPassword = EncryptUtil.encryptPassword(password);
        Integer userId = mallUserService.createUser(mobile, encryptPassword);
        String token = CharUtil.getRandomString(TOKEN_LENGTH);
        userLoginCache.setCache(token, mallUser.getId());
        return LoginDTO.builder().token(token)
                .lastLoginTime(mallUser.getLastLoginTime()).username(mallUser.getUsername()).build();
    }

    public LoginDTO login(String mobile, String password) {
        if (!MobileValidate.isPhone(mobile)) {
            throw new MallException("请输入正确的手机号码");
        }
        MallUser mallUser = mallUserService.selectByMobile(mobile);
        if (mallUser == null) {
            throw new MallException("手机号码未注册，请先注册");
        }
        if (EncryptUtil.matches(password, mallUser.getPassword())) {
            // 更新最后登录时间
            mallUserService.updateLastLoginTime(mallUser.getId());
            // 生成token
            String token = CharUtil.getRandomString(TOKEN_LENGTH);
            userLoginCache.setCache(token, mallUser.getId());
            return LoginDTO.builder().token(token)
                    .lastLoginTime(mallUser.getLastLoginTime()).username(mallUser.getUsername()).build();
        } else {
            throw new MallException("手机或密码错误，请重试");
        }
    }
}
