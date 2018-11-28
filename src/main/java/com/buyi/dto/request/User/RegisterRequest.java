package com.buyi.dto.request.User;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/19 10:50
 */
public class RegisterRequest implements Serializable {
    @NotNull
    private String name;
    @NotNull
    private String password;
    @NotNull
    @Pattern(regexp = "\\d{11}")
    private String telephone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
