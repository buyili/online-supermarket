package com.buyi.constant;

/**
 * Created by 1132989278@qq.com on 2018/11/15 11:30
 */
public enum AfterSaleStatusEnum {
    APPLY_AFTER_SALE(100),//买家申请售后
    AGREE_AFTER_SALE(200),//卖家同意售后
    SALES_RETURN(201),//买家退货
    REFUND(203),//等待卖家退款
    SUCCESS(203),//售后成功

    NOT_AGREE_AFTER_SALE(300), //商家不同意售后
    FAIL(301),//售后失败
    ;
    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    AfterSaleStatusEnum(int status) {
        this.status = status;
    }
}
