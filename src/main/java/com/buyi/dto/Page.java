package com.buyi.dto;

import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/20 16:52
 */
public class Page implements Serializable {
    private Integer limit;
    private Integer offset;

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset * (limit - 1);
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
