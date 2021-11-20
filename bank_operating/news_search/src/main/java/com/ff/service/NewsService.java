package com.ff.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ff.domain.Article;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author FF
 * @date 2021/11/19
 * @TIME:9:18
 */
public interface NewsService extends IService<Article> {

    List<Article> getBySearch( String keywords );
}
