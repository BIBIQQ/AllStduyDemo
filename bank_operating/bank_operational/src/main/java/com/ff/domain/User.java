package com.ff.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:9:32
 */
@TableName("user_account")
public class User {
//    用户id
    @TableField("id")
    private Integer id;
//    用户账户
    @TableField("userAccount")
    private String userAccount;
//    用户余额
    @TableField("amount")
    private Long amount;
//     扣款金额
    //排除 cost  数据库不存在
    @TableField(exist = false)
    private Integer cost;

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", userAccount='" + userAccount + '\'' +
                ", amount=" + amount +
                ", cost=" + cost +
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

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public User() {
    }

    public User(Integer id, String userAccount, Long amount, Integer cost) {
        this.id = id;
        this.userAccount = userAccount;
        this.amount = amount;
        this.cost = cost;
    }
}
