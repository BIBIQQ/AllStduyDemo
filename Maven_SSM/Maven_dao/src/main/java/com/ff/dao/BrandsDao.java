package com.ff.dao;

import com.ff.pojo.Brand;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @author FF
 * @date 2021/11/10
 * @TIME:20:23
 */
@Repository
public interface BrandsDao {

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
    @Delete("DELETE FROM tb_brand where id = #{id}")
    int removeBrandById(Integer id);

    /*
     * 商品分页
     * @Param val
     * @return List<Brand>
     * */
    @Select("SELECT * FROM tb_brand LIMIT 2,#{val}")
    List<Brand> findBrandByVal(Integer val);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int deleteBrandById(@Param("ids") int[] ids);

    /**
     * 分页查询
     * @param begin
     * @param size
     * @return
     */
    @Select("select* from tb_brand limit #{begin},#{size}")
    List<Brand> seletByPage(@Param("begin") int begin, @Param("size") int size);

    /**
     * 总记录数
     * @return
     */
    @Select("select count(*) from tb_brand ")
    int selectTotalCount();


    /**
     * 多条件分页查询
     *
     * @param begin
     * @param size
     * @param brand
     * @return
     */

    List<Brand> selectBrandByPageAndCoundition(@Param("begin") int begin, @Param("size") int size, @Param("brand") Brand brand);



    /**
     * 多条件查询计数
     * @return
     */
    int  selectByCounditionTotalCount(@Param("brand") Brand brand);
}
