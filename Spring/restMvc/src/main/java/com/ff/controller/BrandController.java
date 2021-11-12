package com.ff.controller;

import com.ff.config.SpringConfig;
import com.ff.pojo.Brand;
import com.ff.pojo.PageBean;
import com.ff.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author FF
 * @date 2021/11/10
 * @TIME:20:23
 */
@RequestMapping("/brands")
@RestController
public class BrandController {
    /*   //创建IOC容器
       ApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);
       private  BrandService brandService = ioc.getBean(BrandService.class);*/
    @Autowired
    private BrandService brandService;

    @ResponseBody
    @PostMapping("/add")
    public String addBrand(@RequestBody Brand brand) {
        int i = brandService.addBrand(brand);
        return i > 0 ? "true" : "false";
    }

    /**
     * 多条件搜索
     *
     * @param currentPage
     * @param pageSize
     * @param brand
     * @return
     */
    @ResponseBody
    @PostMapping("/{currentPage}&{pageSize}")
    public PageBean<Brand> findAll(@PathVariable Integer currentPage, @PathVariable Integer pageSize, @RequestBody Brand brand) {
        PageBean<Brand> brandPageBean = brandService.selectBrandByPageAndCoundition(currentPage, pageSize, brand);
        return brandPageBean;
    }

    /**
     *搜索所有
     * @return
     */
    @ResponseBody
    @GetMapping("/all")
    public List<Brand> findAll2() {
        List<Brand> allBrand = brandService.findAllBrand();
        return allBrand;
    }

    /**
     * 单个删除
     * @param brand
     * @return
     */
    @ResponseBody
    @DeleteMapping("/removeByid")
    public  String removeBrand(@RequestBody Brand brand){
        int i = brandService.removeBrandById(brand.getId());
        return i > 0 ? "true" : "false";
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @ResponseBody
    @DeleteMapping("/removeByids")
    public  String removeBrands(@RequestBody int[] ids){
        int i = brandService.removeBrandByIds(ids);
        return i > 0 ? "true" : "false";
    }

    /**
     * 修改
     * @param brand
     * @return
     */
    @ResponseBody
    @PutMapping
    public String modifyBrand(@RequestBody Brand brand){
        int i = brandService.modifyBrand(brand);
        return i > 0 ? "true" : "false";
    }
}
