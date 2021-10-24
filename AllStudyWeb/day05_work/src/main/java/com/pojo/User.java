package com.pojo;

/**
 * @author FF
 * @date 2021/10/23
 * @TIME:16:17
 */
public class User {
    // 用户文件
    private  int uid;
    //  用户名字
    private String userName;
    //  用户 电话
    private String userCall;

    @Override
    public String toString() {
        return " userName='" + userName + '\'' +
                ", userCall='" + userCall + '\'';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCall() {
        return userCall;
    }

    public void setUserCall(String userCall) {
        this.userCall = userCall;
    }

    public User() {
    }

    public User(int uid, String userName, String userCall) {
        this.uid = uid;
        this.userName = userName;
        this.userCall = userCall;
    }
}
