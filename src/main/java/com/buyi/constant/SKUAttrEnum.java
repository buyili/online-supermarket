package com.buyi.constant;

/**
 * Created by 1132989278@qq.com on 2018/11/13 18:00
 */
public enum SKUAttrEnum {
    IS_SKU(1), NOT_SKU(2);
    private int status;

    SKUAttrEnum(int status) {
        this.status = status;
    }
}
