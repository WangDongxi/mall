package com.xydq.mall.wx.controller;

import com.xydq.mall.core.biz.MallIndexBizService;
import com.xydq.mall.core.dto.IndexDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghuaidong
 * @date 2020/2/27
 */
@RestController
@RequestMapping("/index")
public class WxIndexController {

    @Autowired
    private MallIndexBizService mallIndexBizService;

    @RequestMapping("")
    public IndexDTO index() {
        return mallIndexBizService.getIndexDTO();
    }

}
