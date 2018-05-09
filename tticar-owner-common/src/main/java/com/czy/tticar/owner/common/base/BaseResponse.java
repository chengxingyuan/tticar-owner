package com.czy.tticar.owner.common.base;

/**
 * @author chengxy
 * @date 2018/5/9 10:20
 */
public class BaseResponse<T> {
    /**
     * 响应码
     * */
    private String code;

    /**
     * 响应码信息
     * */
    private String message;

    /**
     * 响应实体信息
     * */
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
