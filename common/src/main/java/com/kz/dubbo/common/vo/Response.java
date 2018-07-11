package com.kz.dubbo.common.vo;

import com.kz.dubbo.common.ResponseCode;

import java.io.Serializable;

public class Response<T> implements Serializable {

    public static Response<?> SUCCESS = new Response<>(ResponseCode.SUCCESS, ResponseCode.MESSAGE_SUCCESS, null);

    protected int code = ResponseCode.SUCCESS;
    protected String msg = ResponseCode.MESSAGE_SUCCESS;
    protected T data;

    public Response() {

    }

    public Response(T data) {
        this.data = data;
    }

    public Response(int code, String msg) {
        this(code, msg, null);
    }

    public Response(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Response{");
        sb.append("code=").append(code);
        sb.append(", msg='").append(msg).append('\'');
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
