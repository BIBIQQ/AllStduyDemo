package com.ff.Service.Impl;

import com.ff.Service.BookService;
import com.ff.dao.BookDao;
import com.ff.dao.impl.BookDaoImpl;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author FF
 * @date 2021/11/5
 * @TIME:10:37
 */

public class BookServiceImpl  implements BookService, InitializingBean, DisposableBean {
    //删除业务层使用new的方式创建对象
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book serivce save..");
        bookDao.save();
    }
    //提供对应的set方法
    public void setBookDao(BookDao bookDao){
        this.bookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        System.out.println("service  init");
    }
}
