package com.ff.controller;

import com.ff.config.SpringConfig;
import com.ff.exception.SystemException;
import com.ff.pojo.Brand;
import com.ff.pojo.Code;
import com.ff.pojo.PageBean;
import com.ff.pojo.Result;
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

//    @ResponseBody
    @PostMapping("/add")
    public Result addBrand(@RequestBody Brand brand) {
        int i = brandService.addBrand(brand);
//        return i > 0 ? "true" : "false";
        return new Result(i>0? Code.SAVE_OK:Code.SAVE_ERR,null);
    }

    /**
     * 多条件搜索
     *
     * @param currentPage
     * @param pageSize
     * @param brand
     * @return
     */
//    @ResponseBody
    @PostMapping("/{currentPage}&{pageSize}")
    public Result findAll(@PathVariable Integer currentPage, @PathVariable Integer pageSize, @RequestBody Brand brand) {

        PageBean<Brand> brandPageBean = null;
        try {
            brandPageBean = brandService.selectBrandByPageAndCoundition(currentPage, pageSize, brand);
//            int i= 1/0;
        } catch (Exception e) {
            throw  new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器繁忙，请稍后重试！");
        }

        Integer code = brandPageBean !=null?Code.GET_OK:Code.GET_ERR;
        String msg = brandPageBean !=null?"":"未能搜索到，请重新输入";
        return new Result(code,brandPageBean,msg);
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
//    @ResponseBody
    @DeleteMapping("/removeByid")
    public  Result removeBrand(@RequestBody Brand brand){
        int i = brandService.removeBrandById(brand.getId());
        return new Result(i>0? Code.DELETE_OK:Code.DELETE_ERR,null);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @ResponseBody
    @DeleteMapping("/removeByids")
    public  Result removeBrands(@RequestBody int[] ids){
        int i = brandService.removeBrandByIds(ids);
        return new Result(i>0? Code.DELETE_OK:Code.DELETE_ERR,null);
    }

    /**
     * 修改
     * @param brand
     * @return
     */
    @ResponseBody
    @PutMapping
    public Result modifyBrand(@RequestBody Brand brand){
        int i = brandService.modifyBrand(brand);
        return new Result(i>0? Code.UPDATE_OK:Code.UPDATE_ERR,null);
    }
}
