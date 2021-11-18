package com.ff.dao;

import com.ff.domain.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 文章信息表，存储已发布的文章 Mapper 接口
 * </p>
 *
 * @author 方某
 * @since 2021-11-18
 */
@Mapper
public interface ArticleDao extends BaseMapper<Article> {
    /**
     * 搜索Top10
     * @param current
     * @param size
     * @return
     */
    @Select("SELECT * FROM ap_article  ORDER  BY  likes * 3+collection * 8 + comment DESC LIMIT #{current},#{size}")
    List<Article> getTop(@Param("current") Integer current, @Param("size") Integer size);

}
