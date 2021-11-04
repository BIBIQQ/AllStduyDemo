package com.itheima.mapper;

import com.itheima.pojo.Brand;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author FF
 * @date 2021/11/1
 * @TIME:19:25
 */
public interface BrandMapper {
    /*
     * 搜索所有商品信息
     * */
    @Select("select * from tb_brand")
    List<Brand> findAllBrand();

    /*
     * 增加商品
     * @Param Brand
     * @return Int
     * */
    @Insert("insert into tb_brand(brandName,companyName,ordered,description,status)  VALUES (#{brand.brandName},#{brand.companyName},#{brand.ordered},#{brand.description},#{brand.status})")
    int addBrand(@Param("brand") Brand brand);

    /*
     * 通过id搜索商品信息
     * @Param Brand
     * @return Brand
     * */
    @Select("select * from tb_brand where id = #{brand.id}")
    Brand selectBrandById(@Param("brand") Brand brand);

    /*
     * 修改商品信息
     * @Param Brand
     * @return int
     * */
    @Update("UPDATE tb_brand SET brandName = #{brand.brandName},companyName= #{brand.companyName},ordered= #{brand.ordered},description= #{brand.description},status= #{brand.status} WHERE id=#{brand.id};")
    int modifyBrand(@Param("brand") Brand brand);

    /*
     * 通过id删除商品信息
     * @Param Brand
     * @return Brand
     * */
    @Delete("DELETE FROM tb_brand where id = #{brand.id}")
    int removeBrandById(@Param("brand") Brand brand);

    /*
    * 商品分页
     * @Param val
     * @return List<Brand>
    * */
    @Select("SELECT * FROM tb_brand LIMIT 2,#{val}")
    List<Brand> findBrandByVal(Integer val);
}

