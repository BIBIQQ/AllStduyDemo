package com.pojo;

import lombok.Data;

/**
 * @author FF
 * @date 2021/10/25
 * @TIME:19:48
 */
@Data
public class Prouduct {
    private Integer id;
    private String productName;
    private String catalog;

    @Override
    public String toString() {
        return
                 "productName='"+productName + '\'' +
                ", catalog='" + catalog + '\'';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public Prouduct(Integer id, String productName, String catalog) {
        this.id = id;
        this.productName = productName;
        this.catalog = catalog;
    }

    public Prouduct() {
    }
}
