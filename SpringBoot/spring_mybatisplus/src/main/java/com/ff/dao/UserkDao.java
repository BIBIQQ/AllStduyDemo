package com.ff.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ff.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserkDao extends BaseMapper<Book> {

}
