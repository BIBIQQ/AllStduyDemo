package com.ff.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ff.dao.NewsDao;
import com.ff.domain.Article;
import com.ff.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author FF
 * @date 2021/11/19
 * @TIME:9:18
 */
@Service
public class NewsServiceImpl extends ServiceImpl<NewsDao, Article> implements NewsService {

    @Autowired
    private NewsDao newsDao;

    public List<Article> getBySearch(String keywords){
        //判断参数是否正常
        if(keywords == null || keywords == ""){
            return  null;
        }
        //条件搜索   模糊搜索
        LambdaQueryWrapper<Article> lqw = new LambdaQueryWrapper<>();
        lqw.like(Article::getTitle,keywords);
        List<Article> articles = newsDao.selectList(lqw);

        return articles;
    }

}
