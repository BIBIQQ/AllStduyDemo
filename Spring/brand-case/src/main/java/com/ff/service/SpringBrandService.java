package com.ff.service;

import com.ff.pojo.Brand;
import com.ff.pojo.PageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author FF
 * @date 2021/11/7
 * @TIME:19:45
 */
public interface SpringBrandService {
    /**
     * 查找所有
     * @return
     */
    List<Brand> findAllBrand();

    /**
     * 增加商品
     * @param brand
     * @return
     */
    int addBrand(@Param("brand") Brand brand);

    /**
     * 通过id搜索商品
     * @param brand
     * @return
     */
    Brand selectBrandById(@Param("brand") Brand brand);

    /**
     * 修改商品
     * @param brand
     * @return
     */
    int modifyBrand(@Param("brand") Brand brand);

    /**
     *
     * 通过id删除商品
     * @param id
     * @return
     */
    @Transactional
    int removeBrandById(Integer id);

    /**
     * 查找商品，通过id
     * @param val
     * @return
     */
    List<Brand> findBrandByVal(Integer val);

    /**
     * 批量删除 商品  通过id
     * @param ids
     * @return
     */
    @Transactional
    int removeBrandByIds(@Param("ids") int[] ids);

    /**
     * 商品分页
     * @param begin
     * @param size
     * @return
     */
    PageBean<Brand> seletByPage(@Param("begin") int begin, @Param("size")int size);

    /**
     * 商品的记录数
     * @return
     */
    int selectTotalCount();

    /**
     * 商品分页 多条件动态查询
     * @param begin
     * @param size
     * @param brand
     * @return
     */
    PageBean<Brand> selectBrandByPageAndCoundition(@Param("begin") int begin,@Param("size")int size,@Param("brand")Brand brand);

    /**
     * 多条件动态查询的总记录数
     * @param brand
     * @return
     */
    int  selectByCounditionTotalCount(@Param("brand")Brand brand);
}
