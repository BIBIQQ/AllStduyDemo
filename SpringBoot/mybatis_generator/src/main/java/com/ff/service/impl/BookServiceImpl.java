package com.ff.service.impl;

import com.ff.domain.Book;
import com.ff.dao.BookDao;
import com.ff.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 方某
 * @since 2021-11-16
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {

}
