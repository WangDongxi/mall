package com.xydq.mall.user.service;

import com.xydq.mall.user.dao.domain.MallUser;
import com.xydq.mall.user.dao.domain.MallUserExample;
import com.xydq.mall.user.dao.mapper.MallUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;

/**
 * @author wanghuaidong
 * @date 2020/4/4
 */
@Service
public class MallUserService {

    @Autowired
    private MallUserMapper mallUserMapper;

    public Integer createUser(String mobile, String password) {
        MallUser mallUser = new MallUser();
        mallUser.setAddTime(new Date());
        mallUser.setLastLoginTime(new Date());
        mallUser.setMobile(mobile);
        mallUser.setPassword(password);
        mallUser.setUsername(mobile);
        mallUserMapper.insertSelective(mallUser);
        return mallUser.getId();
    }

    public MallUser selectByMobile(String mobile) {
        MallUserExample mallUserExample = new MallUserExample();
        mallUserExample.createCriteria().andMobileEqualTo(mobile).andDeletedIdEqualTo(0);
        return CollectionUtils.firstElement(mallUserMapper.selectByExample(mallUserExample));
    }

    public MallUser selectById(Integer userId) {
        return mallUserMapper.selectByPrimaryKey(userId);
    }

}
