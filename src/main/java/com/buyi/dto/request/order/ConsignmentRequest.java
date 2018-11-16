package com.buyi.dto.request.order;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/16 15:27
 */
public class ConsignmentRequest implements Serializable {

    @NotNull
    private String id; //number for order

    @NotNull
    private String expressNum; //number for express

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExpressNum() {
        return expressNum;
    }

    public void setExpressNum(String expressNum) {
        this.expressNum = expressNum;
    }
}
