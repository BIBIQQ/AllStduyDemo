package com.ff.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ff.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface  UserDao extends BaseMapper<Book> {

}
