package com.ff.service.impl;

import com.ff.domain.Article;
import com.ff.dao.ArticleDao;
import com.ff.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 文章信息表，存储已发布的文章 服务实现类
 * </p>
 *
 * @author 方某
 * @since 2021-11-18
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleDao, Article> implements IArticleService {

    @Autowired
    private ArticleDao articleDao;
    /**
     * 搜索Top10*/
    @Override
    public List<Article> getTop(Integer current, Integer size) {
        return articleDao.getTop(current, size);
    }
}
