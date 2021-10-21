package com.pojo;

/**
 * @author FF
 * @date 2021/10/18
 * @TIME:16:42
 */
/*
 *品牌
 * */
public class Brand {
/*
* 使用对应包装类型
* */
    //id 主键
    private Integer id;
    //品牌名称
    private String brand_name;
    //企业名称
    private String company_name;
    //排序字段
    private Integer ordered;
    //描述信息
    private String description;
    //状态：0：禁用  1：启用
    private Integer status;

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brand_name='" + brand_name + '\'' +
                ", company_name='" + company_name + '\'' +
                ", ordered=" + ordered +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public Integer getOrdered() {
        return ordered;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Brand() {
    }

    public Brand(Integer id, String brand_name, String company_name, Integer ordered, String description, Integer status) {
        this.id = id;
        this.brand_name = brand_name;
        this.company_name = company_name;
        this.ordered = ordered;
        this.description = description;
        this.status = status;
    }
}
