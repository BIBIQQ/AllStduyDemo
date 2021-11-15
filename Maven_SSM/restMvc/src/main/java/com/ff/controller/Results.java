package com.ff.controller;

import com.ff.exception.BusinessException;
import com.ff.exception.SystemException;
import com.ff.pojo.Brand;
import com.ff.pojo.Code;
import com.ff.pojo.Result;
import com.ff.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author FF
 * @date 2021/11/12
 * @TIME:11:33
 */
@RequestMapping("/results")
@RestController
public class Results {
    @Autowired
    private BrandService brandService;

    @GetMapping
    public Result getBrands() {
        /*    int id = 5;
        if(id > 10){
            throw new BusinessException(Code.BUSINESS_ERR, "请勿重复操作！");
        }
        if(id < 5 ){
            throw new SystemException(Code.SYSTEM_ERR, "基操，勿6！");
        }*/
      /*  try {
            int i = 1 / 0;

        } catch (Exception ex) {
            throw new SystemException(Code.SYSTEM_UNKNOW_ERR, "出现错误请重新操作");
        }*/


        List<Brand> allBrand = brandService.findAllBrand();

        Integer code = allBrand != null ? Code.GET_OK : Code.GET_ERR;
        String msg = allBrand != null ? "" : "数据获取失败.请重试";
        return new Result(code, allBrand, msg);
    }
}
