package com.xydq.mall.wx.controller;

import com.xydq.mall.core.biz.MallUserBizService;
import com.xydq.mall.core.dto.LoginResult;
import com.xydq.mall.utils.model.MallResult;
import com.xydq.mall.wx.model.param.LoginParam;
import com.xydq.mall.wx.model.param.RegisterParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghuaidong
 * @date 2020/4/4
 */
@RestController
@RequestMapping("/user")
public class WxUserController {

    @Autowired
    private MallUserBizService mallUserBizService;

    @PostMapping("/register")
    public MallResult<LoginResult> register(@RequestBody @Validated RegisterParam registerParam) {
        LoginResult result = mallUserBizService.register(registerParam.getMobile(), registerParam.getPassword());
        return MallResult.success(result);
    }

    @PostMapping("/login")
    public MallResult<LoginResult> login(@RequestBody @Validated LoginParam loginParam) {
        LoginResult result = mallUserBizService.login(loginParam.getMobile(), loginParam.getPassword());
        return MallResult.success(result);
    }
}
