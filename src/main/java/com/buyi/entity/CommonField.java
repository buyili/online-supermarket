package com.buyi.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 1132989278@qq.com on 2018/11/13 10:23
 */
public class CommonField implements Serializable {

    private Integer deleteStatus;
    private Date createTime;
    private Date deleteTime;

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}
