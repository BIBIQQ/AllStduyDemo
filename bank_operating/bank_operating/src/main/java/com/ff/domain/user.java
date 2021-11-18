package com.ff.domain;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:9:32
 */
@TableName("user_account")
public class user {
//    用户id
    private Integer id;
//    用户账户
    private String userAccount;
//    用户余额
    private Long amount;

    public user(Integer id, String userAccount, Long amount) {
        this.id = id;
        this.userAccount = userAccount;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", userAccount='" + userAccount + '\'' +
                ", amount=" + amount +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public user() {
    }
}
