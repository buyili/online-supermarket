package com.buyi.constant;

/**
 * Created by 1132989278@qq.com on 2018/11/19 9:45
 */
public enum StoreStatusEnum {
    NORMAL(1),LOGOUT(2);

    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    StoreStatusEnum(int status) {
        this.status = status;
    }
}
