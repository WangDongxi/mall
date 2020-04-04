package com.xydq.mall.wx.config;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wanghuaidong
 * @date 2020/4/4
 */
public class MallLogInterceptor implements HandlerInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(MallLogInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!LOGGER.isInfoEnabled()) {
            return true;
        }

        String url = request.getRequestURI();
        LOGGER.info("访问路径：{}，参数：{}", url, JSON.toJSONString(request.getParameterMap()));

        return true;
    }
}
