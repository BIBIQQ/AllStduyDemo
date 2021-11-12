package com.ff.pojo;

import java.util.List;

/**
 * @author FF
 * @date 2021/11/4
 * @TIME:14:05
 */
public class PageBean<T>{
    //总记录数
    private int totalCount;
    //当前页数内容
    private List<T> rows;

    @Override
    public String toString() {
        return "PageBean{" +
                "totalCount=" + totalCount +
                ", rows=" + rows +
                '}';
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public PageBean() {
    }

    public PageBean(Integer totalCount, List<T> rows) {
        this.totalCount = totalCount;
        this.rows = rows;
    }
}
