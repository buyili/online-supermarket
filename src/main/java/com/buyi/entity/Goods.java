package com.buyi.entity;

import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/13 10:07
 */
public class Goods extends CommonField implements Serializable {

    private Integer id;
    private Integer categoryId;
    private String name;
    private Integer storeId;
    private Integer trademarkId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getTrademarkId() {
        return trademarkId;
    }

    public void setTrademarkId(Integer trademarkId) {
        this.trademarkId = trademarkId;
    }
}
