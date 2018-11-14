package com.buyi.entity;

import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/13 9:43
 */
public class Store extends CommonField implements Serializable {
    private Integer id;
    private Integer userId;
    private String name;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
