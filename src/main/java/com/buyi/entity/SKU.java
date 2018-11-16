package com.buyi.entity;

import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/13 10:09
 */
public class SKU extends CommonField implements Serializable {

    private String id;
    private Integer goodsId;
    private String skuAttr;
    private Integer count;
    private Float price;
    private String detail;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getSkuAttr() {
        return skuAttr;
    }

    public void setSkuAttr(String skuAttr) {
        this.skuAttr = skuAttr;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
