package com.ff.dao.Impl;

import com.ff.dao.BookDao;

/**
 * @author FF
 * @date 2021/11/6
 * @TIME:19:17
 */
public class BookDaoImpl implements BookDao {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("name = " + name);
    }
}
