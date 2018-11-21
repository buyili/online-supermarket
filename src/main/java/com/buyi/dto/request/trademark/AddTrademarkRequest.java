package com.buyi.dto.request.trademark;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/19 9:47
 */
public class AddTrademarkRequest implements Serializable {
    @NotNull
    private String name;

    @NotNull
    private MultipartFile logo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MultipartFile getLogo() {
        return logo;
    }

    public void setLogo(MultipartFile logo) {
        this.logo = logo;
    }
}
