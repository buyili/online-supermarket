package com.buyi.dto.response.user;

import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/19 14:32
 */
public class UserResponse implements Serializable {
    private Integer id;
    private String name;
    private String telephone;

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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
