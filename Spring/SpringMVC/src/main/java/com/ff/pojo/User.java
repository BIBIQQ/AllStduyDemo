package com.ff.pojo;

/**
 * @author FF
 * @date 2021/11/10
 * @TIME:15:30
 */
public class User {
    private String adress;
    private String price;

    private Brand brand;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }


    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "adress='" + adress + '\'' +
                ", price='" + price + '\'' +
                ", brand=" + brand +
                '}';
    }

    public User(String adress, String price, Brand brand) {
        this.adress = adress;
        this.price = price;
        this.brand = brand;
    }
}
