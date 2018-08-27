package com.github.oneyx.retrofit.spring.boot.autoconfigure.exception;

/**
 * TODO 类描述
 *
 * @author liangtian
 */
public class RetrofitNotClasspathException extends RuntimeException{

    public RetrofitNotClasspathException(String message, Throwable cause) {
        super(message, cause);
    }
}
