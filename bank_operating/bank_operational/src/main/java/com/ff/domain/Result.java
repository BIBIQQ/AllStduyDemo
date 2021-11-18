package com.ff.domain;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:9:34
 */

/**
 * 请求接口
 * 状态
 * 返回描述
 * 扣款账户
 */
public class Result {
//    请求状态
    private boolean status;
//    返回值描述
    private String message;
//    扣款账户
    private String userAccount;

    public Result(boolean status, String message, String userAccount) {
        this.status = status;
        this.message = message;
        this.userAccount = userAccount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Result() {
    }
}
