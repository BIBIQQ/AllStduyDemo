package com.ff.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ff.domain.Article;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author FF
 * @date 2021/11/19
 * @TIME:9:27
 */
@Mapper
public interface NewsDao extends BaseMapper<Article> {
}
