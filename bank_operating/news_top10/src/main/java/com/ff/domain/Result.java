package com.ff.domain;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:15:44
 */
public class Result {

    private boolean status;
    private  String message;

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", message='" + message + '\'' +
                '}';
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

    public Result() {
    }

    public Result(boolean status, String message) {
        this.status = status;
        this.message = message;
    }
}
