package com.itheima.pojo;

import java.net.InetAddress;

/**
 * @author FF
 * @date 2021/10/28
 * @TIME:18:58
 */
public class User {
    private Integer userId; //用户ID
    private  String userName; //用户名
    private String userPass; //用户密码
    private String email; //用户邮箱
    private String picUrl; // 用户头像
    private Integer role;//1代表普通用户；2代表管理员
    private String lastLoginTime; //最后登录时间
    private Integer loginStatus; // 登录状态，0代表未登录，1代表已登录
    private Integer talkStatus; //  发言状态，0代表未屏蔽发言（默认），1代表已屏蔽发言

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                ", email='" + email + '\'' +
                ", picUrl='" + picUrl + '\'' +
                ", role=" + role +
                ", lastLoginTime='" + lastLoginTime + '\'' +
                ", loginStatus=" + loginStatus +
                ", talkStatus=" + talkStatus +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    public Integer getTalkStatus() {
        return talkStatus;
    }

    public void setTalkStatus(Integer talkStatus) {
        this.talkStatus = talkStatus;
    }

    public User() {
    }

    public User(Integer userId, String userName, String userPass, String email, String picUrl, Integer role, String lastLoginTime, Integer loginStatus, Integer talkStatus) {
        this.userId = userId;
        this.userName = userName;
        this.userPass = userPass;
        this.email = email;
        this.picUrl = picUrl;
        this.role = role;
        this.lastLoginTime = lastLoginTime;
        this.loginStatus = loginStatus;
        this.talkStatus = talkStatus;
    }
}
