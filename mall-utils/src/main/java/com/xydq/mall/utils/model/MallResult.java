package com.xydq.mall.utils.model;

import java.io.Serializable;

/**
 * @author wanghuaidong
 * @date 2020/4/4
 */
public class MallResult<T> implements Serializable {
    private static final long serialVersionUID = 5988731215758757400L;
    private Boolean success;
    private T data;
    private String msg;

    public static <T> MallResult<T> success(T data) {
        MallResult<T> result = new MallResult<>();
        result.setData(data);
        result.setSuccess(true);
        return result;
    }
    public static <T> MallResult<T> success() {
        MallResult<T> result = new MallResult<>();
        result.setSuccess(true);
        return result;
    }
    public static <T> MallResult<T> fail(String msg) {
        MallResult<T> result = new MallResult<>();
        result.setSuccess(false);
        result.setMsg(msg);
        return result;
    }
    public static <T> MallResult<T> fail() {
        MallResult<T> result = new MallResult<>();
        result.setSuccess(false);
        result.setMsg("系统异常，请稍后再试");
        return result;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
