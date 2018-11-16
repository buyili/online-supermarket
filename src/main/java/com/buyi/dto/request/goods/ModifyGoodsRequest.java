package com.buyi.dto.request.goods;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/15 16:39
 */
public class ModifyGoodsRequest implements Serializable {
    @NotNull
    private Integer id;
    private String name;
    private Integer categoryId;
    private Integer trademarkId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
