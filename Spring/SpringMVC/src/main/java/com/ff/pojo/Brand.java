package com.ff.pojo;

/**
 * @author FF
 * @date 2021/11/10
 * @TIME:15:31
 */
public class Brand {
    private  String brandname;

    @Override
    public String toString() {
        return "Brand{" +
                "brandname='" + brandname + '\'' +
                '}';
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public Brand() {
    }

    public Brand(String brandname) {
        this.brandname = brandname;
    }
}
