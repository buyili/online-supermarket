package com.buyi.dto.request.aftersale;

import javax.validation.constraints.NotNull;

/**
 * Created by 1132989278@qq.com on 2018/11/15 11:12
 */
public class AddAfterSaleRequest {

    @NotNull
    private Integer orderSKUId;

    @NotNull
    private Integer userId;

    @NotNull
    private String cause;

    @NotNull
    private Integer method;

    public Integer getOrderSKUId() {
        return orderSKUId;
    }

    public void setOrderSKUId(Integer orderSKUId) {
        this.orderSKUId = orderSKUId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public Integer getMethod() {
        return method;
    }

    public void setMethod(Integer method) {
        this.method = method;
    }
}
