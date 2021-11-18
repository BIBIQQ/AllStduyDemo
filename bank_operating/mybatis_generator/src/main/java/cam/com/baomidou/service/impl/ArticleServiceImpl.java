package com.baomidou.service.impl;

import com.baomidou.domain.Article;
import com.baomidou.dao.ArticleDao;
import com.baomidou.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
