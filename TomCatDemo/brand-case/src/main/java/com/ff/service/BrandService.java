package com.ff.service;

import com.ff.mapper.BrandsMapper;
import com.ff.pojo.Brand;

import com.ff.pojo.PageBean;
import com.ff.util.GetSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author FF
 * @date 2021/11/1
 * @TIME:19:55
 */
public interface BrandService {


    /*
     * 获取所有商品
     * @return   List<Brand>
     *
     * */
    public List<Brand> findAllBrands();

    /*
     * 增加商品
     * @Param  Brand
     * @return boolean
     * */
    public boolean addBrand(Brand brand);

    /*
     * 搜索id商品进行回显
     * @Param Brand
     * @return boolean
     * */
    public Brand selectBrandById(Brand brand);

    /*
     * 修改商品
     * @Param Brand
     * @return int
     * */
    public boolean modifyBrand(Brand brand);

    /*
     * 删除商品
     * @Param id
     * @return boolean
     * */
    public boolean removeBrandById(Brand brand);
    /*
    * 批量删除
    * @Param Ids[] id
    * @return  boolean
    * */
    public boolean deleteBrandById(int[] ids);

    /**
     * 分页查询
     * @param currentPage
     * @param pageSize
     * @return
     */
    public PageBean<Brand> selectByPage(int currentPage,int pageSize);

    /**
     * 多条件分页查询
     * @param currentPage
     * @param pageSize
     * @param brand
     * @return
     */
    public PageBean<Brand> selectByPageAndCoundition(int currentPage,int pageSize,Brand brand);
}
