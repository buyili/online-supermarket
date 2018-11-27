package com.buyi.dto.request.attr.value;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/27 16:52
 */
public class QueryValuesRequest implements Serializable {

    @NotNull
    private Integer attrId;

    @NotNull
    private Integer goodsId;

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
}
