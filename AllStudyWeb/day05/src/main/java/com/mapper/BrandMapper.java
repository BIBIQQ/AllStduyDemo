package com.mapper;

import com.pojo.Brand;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author FF
 * @date 2021/10/20
 * @TIME:19:24
 */
public interface BrandMapper {
    //    查询所有
    List<Brand> selectAll();

    //    查询单条件
    Brand selectID(int id);

    //    多条件查询
    List<Brand> selectBymulti(@Param("status") int status,
                              @Param("companyName") String companyName,
                              @Param("brandName") String brandName);
    List<Brand> selectBymulti (Brand brand);
    //  动态多条件查询
    List<Brand> selectBymulti (Map map);
    //  动态单条件查询
    List<Brand> selectBySingle (Brand brand);
    //  添加
    void add(Brand brand);
    //  修改
    int updata(Brand brand);
    //  删除
    void deletById(int id);
    //  批量删除
    void deletByIds(@Param("ids")int[] ids);

    @Select("select * from tb_brand where id = #{id}")
    Brand selectById(int id);

}
