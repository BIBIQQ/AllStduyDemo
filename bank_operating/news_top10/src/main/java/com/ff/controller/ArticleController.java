package com.ff.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ff.domain.AddPost;
import com.ff.domain.Article;
import com.ff.domain.Result;
import com.ff.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 文章信息表，存储已发布的文章 前端控制器
 * </p>
 *
 * @author 方某
 * @since 2021-11-18
 */
@RestController
@RequestMapping("/hot")
public class ArticleController {

    @Autowired
    private IArticleService iArticleService;

    /**
     * 热搜Top10
     * @return
     */
    @GetMapping("/hotTop")
    List<Article> getTop(){
        Integer current=0;
        Integer size=10;
        List<Article> newstop = iArticleService.getTop(current, size);
        return newstop;
    }

    /**
     * 添加收藏  点赞   评论
     * @param addPost
     * @return
     */
    @PostMapping("/addHotCount")
    Result addHotCount(@RequestBody AddPost addPost){
        Integer status = addPost.getStatus();
        Long id = addPost.getId();
        if(id == null || status == null ||  status< 1 || status > 3){
            return new Result(false,"参数异常，请重新输入");
        }

        Article byId = iArticleService.getById(id);
        if(byId == null){
            return new Result(false,"新闻不存在..");
        }

        // status    点赞 1  评论  2 收藏 3
        byId.setLikes(status==1? byId.getLikes()+1:byId.getLikes());        //点赞
        byId.setComment(status == 2? byId.getComment()+1:byId.getComment());    // 评论
        byId.setCollection(status == 3? byId.getCollection()+1:byId.getCollection());  // 收藏

        boolean falg = iArticleService.updateById(byId);

        return new Result(falg,falg?"添加成功":"添加失败");
    }

}

