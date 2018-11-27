package com.buyi.commons.builder;

import com.buyi.constant.ResponseStatusEnum;

/**
 * Created by 1132989278@qq.com on 2018/11/26 14:55
 */
public class ResponseModel {

    private int status;
    private String msg;
    private Object data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static class Builder {
        private ResponseModel model;

        public Builder() {
            this.model = new ResponseModel();
        }

        public Builder status(int status) {
            model.setStatus(status);
            return this;
        }

        public Builder data(Object data) {
            model.setData(data);
            return this;
        }

        public Builder msg(String msg) {
            model.setMsg(msg);
            return this;
        }

        public ResponseModel build() {
            return model;
        }
    }

    public static class Success{
        private ResponseModel model;

        public Success() {
            ResponseModel model = new ResponseModel();
            model.setStatus(ResponseStatusEnum.SUCCESS.getStatus());
            model.setMsg(ResponseStatusEnum.SUCCESS.getMsg());
            this.model = model;
        }

        public Success data(Object data){
            model.setData(data);
            return this;
        }

        public ResponseModel build(){
            return model;
        }
    }
}
