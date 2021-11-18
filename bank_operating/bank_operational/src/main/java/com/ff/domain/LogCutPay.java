package com.ff.domain;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:10:39
 */

/**
 * 日志实体类
 */
public class LogCutPay {
    //日志id
    private Integer id;
    //日志内容
    private String log;
    //执行结果
    private  String result;
    //日志记录时间
    private  String time;

    @Override
    public String toString() {
        return "LogCutPay{" +
                "id=" + id +
                ", log='" + log + '\'' +
                ", result='" + result + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public LogCutPay() {
    }

    public LogCutPay(Integer id, String log, String result, String time) {
        this.id = id;
        this.log = log;
        this.result = result;
        this.time = time;
    }

    public LogCutPay(String log, String result) {
        this.log = log;
        this.result = result;
    }
}
