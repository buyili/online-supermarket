package com.buyi.constant;

/**
 * Created by 1132989278@qq.com on 2018/11/15 11:48
 */
public enum AfterSaleMethodEnum {
    ONLY_REFUND(1), //only return money
    RETURN_MONEY_AND_GOODS(2); //return money and return goods
    private int method;

    AfterSaleMethodEnum(int method) {
        this.method = method;
    }

    public int getMethod() {

        return method;
    }

    public void setMethod(int method) {
        this.method = method;
    }
}
