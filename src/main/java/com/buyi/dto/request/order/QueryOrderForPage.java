package com.buyi.dto.request.order;

import com.buyi.dto.Page;

import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/20 16:50
 */
public class QueryOrderForPage extends Page implements Serializable {
    private Integer userId;
    private Integer storeId;

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
}
