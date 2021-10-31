package com.ff.web.service;

import com.ff.web.mapper.ArtcleMapper;
import com.ff.web.pojo.Article;
import com.ff.web.pojo.Zone;
import com.ff.web.untils.GetSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author FF
 * @date 2021/10/30
 * @TIME:23:33
 */
public class ArtcleService {
    SqlSessionFactory sqlSessionFactory = GetSqlSessionFactory.GetSqlSessionFactory();
    /*
    * 获取所有的文章分区
    * @return  List
    *
    * */
    public List<Zone> findAllArticleZone(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ArtcleMapper mapper = sqlSession.getMapper(ArtcleMapper.class);
        List<Zone> allArticleZone = mapper.findAllArticleZone();
        return allArticleZone;
    }
    /*
    * 获取所有帖子
    * @return List<Article>
    * */
    public List<Article> findAllArticle(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ArtcleMapper mapper = sqlSession.getMapper(ArtcleMapper.class);
        List<Article> allArticle = mapper.findAllArticle();
        return allArticle;
    } /*
    * 通过ID获取帖子
    * @return List<Article>
    * */
    public  List<Article> findArticleById(Integer zoneId){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ArtcleMapper mapper = sqlSession.getMapper(ArtcleMapper.class);
        List<Article> articleById = mapper.findArticleById(zoneId);
        return articleById;
    }
    /*
    * 获取用户的用户名
    * */

}
