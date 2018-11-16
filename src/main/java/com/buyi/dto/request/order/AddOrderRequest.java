package com.buyi.dto.request.order;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/15 16:43
 */
public class AddOrderRequest implements Serializable {

    @NotNull
    private Integer userId;

    @NotNull
    private Integer storeId;

    @NotNull
    private Integer goodsId;

    @Resource
    private String skuId;

    @NotNull
    private Integer addressId;

    @NotNull
    private String goodsName;

    @NotNull
    private Integer skuCount;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
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
}
