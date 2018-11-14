package com.buyi.entity;

import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/13 10:17
 */
public class AttrValue extends CommonField implements Serializable {
    private Integer id;
    private Integer attrId;
    private String name;
    private Integer goodsId;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
}
