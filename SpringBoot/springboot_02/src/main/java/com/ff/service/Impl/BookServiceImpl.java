package com.ff.service.Impl;

import com.ff.service.BookService;
import org.springframework.stereotype.Service;

/**
 * @author FF
 * @date 2021/11/14
 * @TIME:19:47
 */
@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println(" book  service is running....");
    }
}
