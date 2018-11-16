package com.buyi.entity;

import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/13 10:19
 */
public class SKUAttr extends CommonField implements Serializable {

    private Integer id;
    private Integer attrId;
    private Integer attrValueId;
    private String skuId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public Integer getAttrValueId() {
        return attrValueId;
    }

    public void setAttrValueId(Integer attrValueId) {
        this.attrValueId = attrValueId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
}
