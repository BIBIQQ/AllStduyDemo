package com.ff.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ff.dao.BrandDao;
import com.ff.domain.Brand;
import com.ff.domain.Code;
import com.ff.domain.Result;
import com.ff.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author FF
 * @date 2021/11/17
 * @TIME:14:43
 */
@RestController
@RequestMapping("/brands")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     *动态分页搜索
     * @param currentPage
     * @param size
     * @param brand
     * @return
     */
    @PostMapping("/{currentPage}&{size}")
    Result getAllAndPage(@PathVariable Integer currentPage, @PathVariable Integer size, @RequestBody Brand brand){
        Page page = new Page(currentPage,size);
        LambdaQueryWrapper<Brand> lqw = new LambdaQueryWrapper();
        lqw.eq(brand.getStatus() != null,Brand::getStatus,brand.getStatus());
        lqw.like(brand.getBrandName() != null,Brand::getBrandName,brand.getBrandName());
        lqw.like(brand.getCompanyName() != null,Brand::getCompanyName,brand.getCompanyName());
        //获取分页内容
        Page page1 = brandService.page(page, lqw);
        //设置result
        //设置响应
        Integer code = page1.getRecords() != null? Code.GET_OK:Code.GET_ERR;
        String msg = page1.getRecords() != null? "":"查询失败，请重新输入！";
        //返回响应
        return new Result(code,page1,msg);
    }

    /**
     * 删除
     * @param brand
     * @return
     */
    @DeleteMapping
    Result deleteById(@RequestBody Brand brand){
        boolean falg = brandService.removeById(brand.getId());
        Integer code = falg == true? Code.DELETE_OK:Code.DELETE_ERR;
        String msg = falg == true? "删除成功！恭喜你！":"删除失败，请重新尝试！";
        return  new Result(code,null,msg);
    }

    /**
     * 修改商品
     * @param brand
     * @return
     */
    @PutMapping
    Result updataById(@RequestBody Brand brand){
        boolean falg = brandService.updateById(brand);
        Integer code = falg == true? Code.UPDATE_OK:Code.UPDATE_OK;
        String msg = falg == true? "修改成功！恭喜你！":"修改失败，请重新尝试！";
        return  new Result(code,null,msg);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @DeleteMapping("/ids")
    Result deleteByIds(@RequestBody int[] ids){
        List arr = new ArrayList();
        for (int id : ids) {
            arr.add(id);
        }
        boolean falg = brandService.removeByIds(arr);
        Integer code = falg == true? Code.DELETE_OK:Code.DELETE_ERR;
        String msg = falg == true? "删除成功！恭喜你！":"删除失败，请重新尝试！";
        return  new Result(code,null,msg);
    }

    @PostMapping("/add")
    Result addBrand(@RequestBody Brand brand){
        boolean falg = brandService.save(brand);
        Integer code = falg == true? Code.SAVE_OK:Code.SAVE_ERR;
        String msg = falg == true? "添加成功！恭喜你！":"添加失败，请重新尝试！";
        return  new Result(code,null,msg);
    }


}
