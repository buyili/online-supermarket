package com.buyi.entity;

import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/13 10:15
 */
public class Attr extends CommonField implements Serializable {
    private Integer id;
    private String name;
    private Integer categoryId;
    private Integer isSKU;

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

    public Integer getIsSKU() {
        return isSKU;
    }

    public void setIsSKU(Integer isSKU) {
        this.isSKU = isSKU;
    }
}
