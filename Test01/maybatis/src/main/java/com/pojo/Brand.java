package com.pojo;

import lombok.Data;

/**
 * @author FF
 * @date 2021/10/25
 * @TIME:19:03
 */
@Data
public class Brand {
    private Integer id;
    private Integer userId;
    private Integer productId;
    private User user;
    private Prouduct prouduct;

    @Override
    public String toString() {
        return "Brand{" +
                 user
                 + prouduct ;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Prouduct getProuduct() {
        return prouduct;
    }

    public void setProuduct(Prouduct prouduct) {
        this.prouduct = prouduct;
    }

    public Brand() {
    }

    public Brand(Integer id, Integer userId, Integer productId, User user, Prouduct prouduct) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.user = user;
        this.prouduct = prouduct;
    }
}
