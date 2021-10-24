package com.pojo;

/**
 * @author FF
 * @date 2021/10/24
 * @TIME:10:29
 */
public class BrandsSort {
    private Integer sid;
    private String sort;

    @Override
    public String toString() {
        return sort;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
