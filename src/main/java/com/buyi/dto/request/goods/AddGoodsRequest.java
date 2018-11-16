package com.buyi.dto.request.goods;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/15 16:30
 */
public class AddGoodsRequest implements Serializable {

    @NotNull
    private Integer categoryId;

    @NotNull
    private String name;

    @NotNull
    private Integer storeId;

    private Integer trademarkId;

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
