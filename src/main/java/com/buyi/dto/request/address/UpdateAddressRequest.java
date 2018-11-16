package com.buyi.dto.request.address;

import javax.validation.constraints.NotNull;

/**
 * Created by 1132989278@qq.com on 2018/11/15 10:28
 */
public class UpdateAddressRequest {

    @NotNull
    private Integer id;

    private String address;

    private String name;

    private String telephone;

    private String postcode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
