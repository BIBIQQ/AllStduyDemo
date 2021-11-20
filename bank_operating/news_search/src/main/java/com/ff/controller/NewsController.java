package com.ff.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ff.domain.Article;
import com.ff.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author FF
 * @date 2021/11/19
 * @TIME:9:17
 */
@RestController
@RequestMapping
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/search/{keywords}")
    List<Article> getBySearch(@PathVariable String keywords ){
        List<Article> bySearch = newsService.getBySearch(keywords);
        return bySearch;
    }
}
