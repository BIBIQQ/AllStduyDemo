package com.ff.controller;

import com.ff.domain.Category;
import com.ff.domain.Results;
import com.ff.service.PutiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author FF
 * @date 2021/11/19
 * @TIME:18:12
 */
@RestController
@RequestMapping("/category")
public class PutiController {

    @Autowired
    private PutiService putiService;

    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping("/page/{page}/{pageSize}")
    List<Category> getByPage(@PathVariable Integer page, @PathVariable Integer pageSize){
        List<Category> byPage = putiService.getByPage(page, pageSize);
        return null;
    }

    /**
     * 添加分类
     * @param category
     * @return
     */
    @PostMapping("/add")
    Results addCategory(@RequestBody Category category){
        Results results = putiService.addCategory(category);
        return results;
    }

    /**
     * 删除分类
     * @param request
     * @return
     */
    @GetMapping("/delete")
    Results deleteById(HttpServletRequest request){
        long id = Integer.parseInt(request.getParameter("id"));
         Results results = putiService.deleteById(id);
         return results;
    }

    /**
     * 回显
     * @param request
     * @return
     */
    @GetMapping("/findById")
    Category findById(HttpServletRequest request){
        long id = Integer.parseInt(request.getParameter("id"));
        Category byId = putiService.getById(id);
        return byId;
    }
    @PostMapping("/udataById")
    Results updataById(@RequestBody Category category){
        boolean falg = putiService.updateById(category);

        return falg? Results.success("删除成功"):Results.error("删除失败");

    }
}
