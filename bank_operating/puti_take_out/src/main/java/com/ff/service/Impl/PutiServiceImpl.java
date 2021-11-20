package com.ff.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ff.dao.PutiDao;
import com.ff.domain.Category;
import com.ff.domain.Results;
import com.ff.service.PutiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author FF
 * @date 2021/11/19
 * @TIME:18:14
 */
@Service
public class PutiServiceImpl extends ServiceImpl<PutiDao, Category> implements PutiService {

    @Autowired
    private PutiDao putiDao;

    /**
     * 分页搜索
     * 默认 page 1  pageSize 5
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public List<Category> getByPage(Integer page, Integer pageSize) {


        Page pg = new Page((page-1)*pageSize,pageSize);
        Page page1 = putiDao.selectPage(pg, null);
        List<Category> records = page1.getRecords();
        return records;
    }

    /**
     * 添加分类
     * @param category
     * @return
     */
    @Override
    public Results addCategory(Category category) {
        //校验参数
        if(category.getName() == null||category.getSort() == null||category.getType() == null){
            return Results.error("参数错误重新输入");
        }
        //判断商品是否重复存在
        LambdaQueryWrapper<Category> categoryLambdaQueryWrapper = new LambdaQueryWrapper<>();
        categoryLambdaQueryWrapper.eq(Category::getName,category.getName());
        Category category1 = putiDao.selectOne(categoryLambdaQueryWrapper);
        if(category1 != null){
            return Results.error("分类已经存在，请重新输入");
        }
        //添加商品
        int insert = putiDao.insert(category);

        return insert>0? Results.success("添加成功"):Results.error("添加失败");
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @Override
    public Results deleteById(Long id) {
        if (id == null) {
            return  Results.error("参数错误,请重新输入");
        }
        int falg = putiDao.deleteById(id);
        return falg>0? Results.success("删除成功"):Results.error("删除失败");
    }

}
