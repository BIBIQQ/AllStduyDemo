package com.ff.service;

import com.ff.domain.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 文章信息表，存储已发布的文章 服务类
 * </p>
 *
 * @author 方某
 * @since 2021-11-18
 */
public interface IArticleService extends IService<Article> {
    /**
    * 搜索Top10*/
    List<Article> getTop(Integer current, Integer size);
}
