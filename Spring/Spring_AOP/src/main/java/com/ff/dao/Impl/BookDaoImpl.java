package com.ff.dao.Impl;

import com.ff.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author FF
 * @date 2021/11/8
 * @TIME:15:25
 */
//数据层
@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("book dao save ...");
    }

    @Override
    public void updata() {
        System.out.println("book dao updata...");
//        int i = 1/0;
    }

    @Override
    public void result(String url, String key) {
        System.out.println(key.equals("root"));
    }
}
