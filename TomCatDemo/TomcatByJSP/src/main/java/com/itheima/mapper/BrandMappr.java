package com.itheima.mapper;

import com.itheima.pojo.Brands;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author FF
 * @date 2021/10/29
 * @TIME:15:44
 */
public interface BrandMappr {

    int addBrand(Brands brands);

    List<Brands> findAll();

    int removeBrand(@Param("id") Integer id);


    Brands selectById(Integer id);

    int modifiBrand(Brands brands);
}
