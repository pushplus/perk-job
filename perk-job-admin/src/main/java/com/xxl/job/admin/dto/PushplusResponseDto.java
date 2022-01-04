package com.xxl.job.admin.dto;

/**
 * @author chensiyuan26
 * @date 2022/1/4
 */
public class PushplusResponseDto {

    private Integer code;

    private String msg;

    private String data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
