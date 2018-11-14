package com.buyi.entity;

import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/13 10:38
 */
public class AfterSale extends CommonField implements Serializable {

    private Integer id;
    private Integer orderSKUId;
    private Integer userId;
    private String cause;
    private String result;
    private Integer method;
    private Integer status;
    private String expressDetail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getMethod() {
        return method;
    }

    public void setMethod(Integer method) {
        this.method = method;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getExpressDetail() {
        return expressDetail;
    }

    public void setExpressDetail(String expressDetail) {
        this.expressDetail = expressDetail;
    }
}
