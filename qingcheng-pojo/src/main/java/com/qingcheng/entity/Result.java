package com.qingcheng.entity;

import java.io.Serializable;

/**
 * @Description: 返回前端消息的封装
 * @Author: BaoJun
 * @Date: 2019/8/19 22:17
 * @Version: 1.0
 */
public class Result implements Serializable {
    /**
     * 返回的业务码
     * 0：成功执行   1：发生错误
     */
    private Integer code;

    /**
     * 信息
     */
    private String message;

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result() {
        this.code = 0;
        this.message = "执行成功";
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
