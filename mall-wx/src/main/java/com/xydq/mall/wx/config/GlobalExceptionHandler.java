package com.xydq.mall.wx.config;

import com.xydq.mall.utils.exception.MallException;
import com.xydq.mall.utils.model.MallResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wanghuaidong
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public Object badArgumentHandler(IllegalArgumentException e, HttpServletRequest request) {
        logger.error("request:{}", request.getRequestURI(), e);
        return MallResult.fail();
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    @ResponseBody
    public Object badArgumentHandler(MethodArgumentTypeMismatchException e, HttpServletRequest request) {
        logger.error("request:{}", request.getRequestURI(), e);
        return MallResult.fail();
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseBody
    public Object badArgumentHandler(MissingServletRequestParameterException e, HttpServletRequest request) {
        logger.error("request:{}", request.getRequestURI(), e);
        return MallResult.fail();
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseBody
    public Object badArgumentHandler(HttpMessageNotReadableException e, HttpServletRequest request) {
        logger.error("request:{}", request.getRequestURI(), e);
        return MallResult.fail();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public Object methodArgumentNotValidException(MethodArgumentNotValidException e, HttpServletRequest request) {
        logger.error("request:{}", request.getRequestURI(), e);
        return MallResult.fail(e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object seriousHandler(Exception e, HttpServletRequest request) {
        logger.error("request:{}", request.getRequestURI(), e);
        return MallResult.fail();
    }

    @ExceptionHandler(MallException.class)
    @ResponseBody
    public Object handleBizException(HttpServletRequest request, MallException ex) {
        logger.error("request:{}", request.getRequestURI(), ex);
        return MallResult.fail(ex.getMessage());
    }

}
