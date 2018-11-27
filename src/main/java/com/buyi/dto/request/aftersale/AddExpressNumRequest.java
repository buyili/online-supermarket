package com.buyi.dto.request.aftersale;

import javax.validation.constraints.NotNull;

/**
 * Created by 1132989278@qq.com on 2018/11/15 11:18
 */
public class AddExpressNumRequest {

    @NotNull
    private Integer id;

    //发起当前请求的用户的id
    private Integer userId;

    private String expressDetail;

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

    public String getExpressDetail() {
        return expressDetail;
    }

    public void setExpressDetail(String expressDetail) {
        this.expressDetail = expressDetail;
    }
}
