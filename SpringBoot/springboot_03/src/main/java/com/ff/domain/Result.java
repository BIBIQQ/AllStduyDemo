package com.ff.domain;

/**
 * 字段不是固定 根据需求可自行加减
 * 提供若干个方法 方便操作
 */

/*
* 一个接口
* 请求的路径
* 请求的参数
* 共同
* 非共同
* 响应结果
* */
public class Result {
    // 描述统一格式中的数据
    private Object data;
    // 描述统一格式中的编码，用于区分操作，可以简化配置0或1表示成功失败
    private Integer code;
    // 描述统一格式中的响应消息
    private String msg;

    public Result() {
    }

    public Result(Integer code,Object data) {
        this.data = data;
        this.code = code;
    }

    public Result(Integer code, Object data, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

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
}