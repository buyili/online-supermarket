package com.buyi.exception;

import com.buyi.constant.ResponseStatusEnum;

/**
 * Created by 1132989278@qq.com on 2018/11/15 11:57
 */
public class GlobalException extends RuntimeException {

    private int code;

    public GlobalException(ResponseStatusEnum responseStatusEnum) {
        super(responseStatusEnum.getMsg());
        this.code = responseStatusEnum.getStatus();
    }

    public GlobalException(String message, ResponseStatusEnum responseStatusEnum){
        super(message);
        this.code = responseStatusEnum.getStatus();
    }

    public GlobalException(String message, int code) {
        super(message);
        this.code = code;
    }

    public GlobalException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }
}
