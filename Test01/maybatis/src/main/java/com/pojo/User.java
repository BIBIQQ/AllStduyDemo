package com.pojo;

import lombok.Data;

/**
 * @author FF
 * @date 2021/10/25
 * @TIME:19:46
 */
@Data
public class User {
    private Integer id;
    private String userName;
    private String tel;

    @Override
    public String toString() {
        return "userName='" + userName + '\'' +
                ", tel='" + tel + '\'' ;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public User() {
    }

    public User(Integer id, String userName, String tel) {
        this.id = id;
        this.userName = userName;
        this.tel = tel;
    }
}
