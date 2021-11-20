package com.ff.domain;

/**
 * @author FF
 * @date 2021/11/19
 * @TIME:15:30
 */
public class Results {
    private Integer code;
    private String msg;

    public Results(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Results() {
    }

    @Override
    public String toString() {
        return "Results{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
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
