package com.buyi.dto.request.aftersale;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/15 11:44
 */
public class AfterSaleResultRequest implements Serializable {

    @NotNull
    private Integer id;

    private Integer storeId;

    @NotNull
    private Integer resultCode;

    @NotNull
    private String result;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
