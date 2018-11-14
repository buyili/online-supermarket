package com.buyi.entity;

import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/13 10:28
 */
public class OrderSKU extends CommonField implements Serializable {
    private Integer id;
    private Integer orderId;
    private Integer goodsId;
    private String goodsName;
    private Integer skuCount;
    private Float skuPrice;
    private Float skuSum;
    private String skuDetail;
    private Integer afterSale;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getSkuCount() {
        return skuCount;
    }

    public void setSkuCount(Integer skuCount) {
        this.skuCount = skuCount;
    }

    public Float getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(Float skuPrice) {
        this.skuPrice = skuPrice;
    }

    public Float getSkuSum() {
        return skuSum;
    }

    public void setSkuSum(Float skuSum) {
        this.skuSum = skuSum;
    }

    public String getSkuDetail() {
        return skuDetail;
    }

    public void setSkuDetail(String skuDetail) {
        this.skuDetail = skuDetail;
    }

    public Integer getAfterSale() {
        return afterSale;
    }

    public void setAfterSale(Integer afterSale) {
        this.afterSale = afterSale;
    }
}
