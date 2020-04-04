package com.xydq.mall.wx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghuaidong
 * @date 2020/2/27
 */
@RestController
@RequestMapping("/wx/index")
public class WxIndexController {

    @RequestMapping("/")
    public String index() {
        return "这是一个啥?";
    }

}
