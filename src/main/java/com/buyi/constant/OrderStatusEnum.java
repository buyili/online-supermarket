package com.buyi.constant;

/**
 * Created by 1132989278@qq.com on 2018/11/16 14:53
 */
public enum OrderStatusEnum {
    ORDER(100),
    PAY_SUCCESS(200),
    CONSIGNMENT(201),
    CONFIRM_RECEIPT(202),
    SUCCESS(203),
    FAIL(300),
    ;

    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    OrderStatusEnum(int status) {
        this.status = status;
    }
}
