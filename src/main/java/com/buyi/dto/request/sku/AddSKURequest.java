package com.buyi.dto.request.sku;

import javax.validation.constraints.NotNull;

/**
 * Created by 1132989278@qq.com on 2018/11/16 16:10
 */
public class AddSKURequest {
    @NotNull
    private Integer goodsId;

    @NotNull
    private String skuAttr;

    @NotNull
    private Float price;

    @NotNull
    private Integer count;

    @NotNull
    private String detail;

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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
