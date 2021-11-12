package com.ff.service.Impl;

import com.ff.dao.BookDao;
import com.ff.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author FF
 * @date 2021/11/9
 * @TIME:16:06
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public void result(String url, String key) {
         bookDao.result(url,key);
    }
}
