package com.buyi.dto.request.goods;

import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/20 11:46
 */
public class QueryGoodsRequest implements Serializable {

    private Integer storeId;
    private Integer categoryId;
    private Integer trademarkId;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getTrademarkId() {
        return trademarkId;
    }

    public void setTrademarkId(Integer trademarkId) {
        this.trademarkId = trademarkId;
    }
}
