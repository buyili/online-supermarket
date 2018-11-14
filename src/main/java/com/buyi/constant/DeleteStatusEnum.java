package com.buyi.constant;

/**
 * Created by 1132989278@qq.com on 2018/11/13 11:01
 */
public enum DeleteStatusEnum {
    NORMAL(1),DELETE(2);

    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    DeleteStatusEnum(int status) {
        this.status = status;
    }
}
