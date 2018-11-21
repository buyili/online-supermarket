package com.buyi.dto.response.trademark;

import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/20 10:01
 */
public class TrademarkResponse implements Serializable {

    private Integer id;
    private String name;
    private String logoUrl;

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

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }
}
