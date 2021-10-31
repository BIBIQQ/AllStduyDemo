package com.ff.web.mapper;

import com.ff.web.pojo.Article;
import com.ff.web.pojo.Zone;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author FF
 * @date 2021/10/30
 * @TIME:23:40
 */
public interface ArtcleMapper {

    //获取所有分区
    List<Zone> findAllArticleZone();
    //获取所有帖子
    @Select("select * from bbs_article_table")
    List<Article> findAllArticle();
    //通过id获取帖子
    @Select("select * from bbs_article_table where zoneId = #{zoneId} ORDER BY isTop DESC ")
    List<Article> findArticleById(@Param("zoneId") Integer zoneId);
}
