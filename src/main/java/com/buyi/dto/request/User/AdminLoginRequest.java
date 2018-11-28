package com.buyi.dto.request.User;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/28 17:02
 */
public class AdminLoginRequest implements Serializable {
    @NotNull
    private String telephone;
    @NotNull
    private String password;

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
