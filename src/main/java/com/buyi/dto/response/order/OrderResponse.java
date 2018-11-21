package com.buyi.dto.response.order;

import com.buyi.entity.OrderSKU;
import com.buyi.entity.SKU;
import com.buyi.entity.Store;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/20 14:26
 */
public class OrderResponse implements Serializable {

    private String id;
    private Integer storeId;
    private String name;
    private Float sum;
    private Integer status;
    private String address;
    private String expressNum;
    private Integer payMethod;
    private List<OrderSKU> orderSKUS;
    private Store store;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSum() {
        return sum;
    }

    public void setSum(Float sum) {
        this.sum = sum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getExpressNum() {
        return expressNum;
    }

    public void setExpressNum(String expressNum) {
        this.expressNum = expressNum;
    }

    public Integer getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    public List<OrderSKU> getOrderSKUS() {
        return orderSKUS;
    }

    public void setOrderSKUS(List<OrderSKU> orderSKUS) {
        this.orderSKUS = orderSKUS;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
