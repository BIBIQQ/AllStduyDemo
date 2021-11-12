package com.ff.domain;

import com.sun.xml.internal.ws.client.sei.ResponseBuilder;

/**
 * @author FF
 * @date 2021/11/6
 * @TIME:21:21
 */
public class Acount {
    private Integer id;
    private String name;
    private Double money;

    @Override
    public String toString() {
        return "Acount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Acount() {
    }

    public Acount(Integer id, String name, Double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }
}
