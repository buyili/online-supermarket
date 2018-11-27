package com.buyi.dto.response.user;

import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/26 17:35
 */
public class LoginResponse implements Serializable {
    private int id;
    private String name;
    private String token;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
