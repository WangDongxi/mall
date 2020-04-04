package com.xydq.mall.utils.exception;

/**
 * @author wanghuaidong
 * @date 2020/4/4
 */
public class MallException extends RuntimeException {
    public MallException() {
        super();
    }

    public MallException(String message) {
        super(message);
    }

    public MallException(String message, Throwable cause) {
        super(message, cause);
    }

    public MallException(Throwable cause) {
        super(cause);
    }

}
