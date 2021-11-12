package com.ff.dao.impl;

import com.ff.dao.BookDao;

/**
 * @author FF
 * @date 2021/11/5
 * @TIME:10:36
 */
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book Dao save..");
    }
    //Bean创建后
    @Override
    public void init() {
        /*System.out.println("init....");*/
    }
    //Bean销毁前
    @Override
    public void destory() {
        System.out.println("destory...");
    }
}
