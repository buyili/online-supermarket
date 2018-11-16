package com.buyi.dto.request.address;

import javax.validation.constraints.NotNull;

/**
 * Created by 1132989278@qq.com on 2018/11/15 10:19
 */
public class AddAddressRequest {

    @NotNull
    private Integer userId;

    @NotNull
    private String address;

    @NotNull
    private String name;

    @NotNull
    private String telephone;

    @NotNull
    private String postcode;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
