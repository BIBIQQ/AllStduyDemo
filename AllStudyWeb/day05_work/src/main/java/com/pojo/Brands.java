package com.pojo;

import java.util.List;

/**
 * @author FF
 * @date 2021/10/23
 * @TIME:16:46
 */
public class Brands {
//    商品详情
    private Integer bid;
    private Integer sortId;
    private List<BrandsSort> brandsSort;
    private  String brandName;
    private  String brandSize;
    private  String brandStyle;
    private  String brandPrice;

    @Override
    public String toString() {
        return ", brandsSort=" + brandsSort +
                ", brandName='" + brandName + '\'' +
                ", brandSize='" + brandSize + '\'' +
                ", brandStyle='" + brandStyle + '\'' +
                ", brandPrice='" + brandPrice + '\'';
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public List<BrandsSort> getBrandsSort() {
        return brandsSort;
    }

    public void setBrandsSort(List<BrandsSort> brandsSort) {
        this.brandsSort = brandsSort;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandSize() {
        return brandSize;
    }

    public void setBrandSize(String brandSize) {
        this.brandSize = brandSize;
    }

    public String getBrandStyle() {
        return brandStyle;
    }

    public void setBrandStyle(String brandStyle) {
        this.brandStyle = brandStyle;
    }

    public String getBrandPrice() {
        return brandPrice;
    }

    public void setBrandPrice(String brandPrice) {
        this.brandPrice = brandPrice;
    }
}
