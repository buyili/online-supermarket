package com.buyi.commons.util;

import com.buyi.constant.ResponseStatusEnum;
import com.buyi.exception.GlobalException;

/**
 * Created by 1132989278@qq.com on 2018/11/15 12:15
 */
public class Assert {

    public static void isNull(Object object, int code, String msg) {
        if (null != object) {
            throw new GlobalException(msg, code);
        }
    }

    public static void isNull(Object object, ResponseStatusEnum respStatusEnum) {
        if (null != object) {
            throw new GlobalException(respStatusEnum);
        }
    }

    public static void isNull(Object object, ResponseStatusEnum respStatusEnum, String msg) {
        if (null != object) {
            throw new GlobalException(msg, respStatusEnum.getStatus());
        }
    }

    public static void notNull(Object object, int code, String msg) {
        if (null == object) {
            throw new GlobalException(msg, code);
        }
    }

    public static void notNull(Object object, ResponseStatusEnum respStatusEnum) {
        if (null == object) {
            throw new GlobalException(respStatusEnum);
        }
    }

    public static void notNull(Object object, ResponseStatusEnum respStatusEnum, String msg) {
        if (null == object) {
            throw new GlobalException(msg, respStatusEnum.getStatus());
        }
    }
}
