package com.buyi.constant;

/**
 * Created by 1132989278@qq.com on 2018/11/15 12:00
 */
public enum ResponseStatusEnum {
    INFO(100), //信息，服务器收到请求，需要请求者继续执行操作
    SUCCESS(200,"成功"),
    REDIRECT(300),
    CLIENT_ERR(400,"客户端错误"),
    PARAMETER_ERR(401,"参数错误"),
    NOT_REGISTER(402,"未注册"),
    NOT_STORE(403,"未开通商店"),
    NOT_LOGIN(404,"未登录"),

    SERVER_ERR(500,"服务端错误")
    ;

    private int status;
    private String msg;

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

    ResponseStatusEnum(int status) {
        this.status = status;
    }

    ResponseStatusEnum(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }
}
