package com.ff.service.impl;

import com.ff.mapper.BrandsMapper;
import com.ff.pojo.Brand;
import com.ff.pojo.PageBean;
import com.ff.service.BrandService;
import com.ff.util.GetSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author FF
 * @date 2021/11/4
 * @TIME:15:00
 */
public class BrandServiceImpl implements BrandService {

    SqlSessionFactory sqlSessionFactory = GetSqlSessionFactory.GetSqlSessionFactory();

    /*
     * 获取所有商品
     * @return   List<Brand>
     *
     * */
    @Override
    public List<Brand> findAllBrands() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandsMapper mapper = sqlSession.getMapper(BrandsMapper.class);
        List<Brand> allBrand = mapper.findAllBrand();
        return allBrand;
    }

    /*
     * 增加商品
     * @Param  Brand
     * @return boolean
     * */
    public boolean addBrand(Brand brand) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandsMapper mapper = sqlSession.getMapper(BrandsMapper.class);
        int i = mapper.addBrand(brand);
        if (i > 0) {
            sqlSession.commit();
        }
        return i > 0;
    }

    /*
     * 搜索id商品进行回显
     * @Param Brand
     * @return boolean
     * */
    public Brand selectBrandById(Brand brand) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandsMapper mapper = sqlSession.getMapper(BrandsMapper.class);
        Brand brandById = mapper.selectBrandById(brand);
        return brandById;

    }

    /*
     * 修改商品
     * @Param Brand
     * @return int
     * */
    public boolean modifyBrand(Brand brand) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandsMapper mapper = sqlSession.getMapper(BrandsMapper.class);
        int i = mapper.modifyBrand(brand);
        if (i > 0) {
            sqlSession.commit();
        }
        return i > 0;
    }

    /*
     * 删除商品
     * @Param id
     * @return boolean
     * */
    public boolean removeBrandById(Brand brand) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandsMapper mapper = sqlSession.getMapper(BrandsMapper.class);
        int i = mapper.removeBrandById(brand);
        if (i > 0) {
            sqlSession.commit();
        }
        return i > 0;
    }
    /*
     * 批量删除
     * @Param Ids[] id
     * @return  boolean
     * */
    public boolean deleteBrandById(int[] ids){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandsMapper mapper = sqlSession.getMapper(BrandsMapper.class);
        int i = mapper.deleteBrandById(ids);
        if (i > 0) {
            sqlSession.commit();
        }
        return i > 0;
    }

    /**
     * 分页查询
     * @param currentPage
     * @param pageSize
     * @return
     */
    public PageBean<Brand> selectByPage(int currentPage, int pageSize){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandsMapper mapper = sqlSession.getMapper(BrandsMapper.class);

        int begin = (currentPage - 1) * pageSize;
        //当前页数
        List<Brand> brands = mapper.seletByPage(begin, pageSize);
        int totalCount = mapper.selectTotalCount();
        PageBean<Brand> brandPageBean = new PageBean<>();
        brandPageBean.setRows(brands);
        brandPageBean.setTotalCount(totalCount);
        return brandPageBean;
    }

    /**
     * 多条件分页查询
     * @param currentPage
     * @param pageSize
     * @param brand
     * @return
     */
    @Override
    public PageBean<Brand> selectByPageAndCoundition(int currentPage, int pageSize, Brand brand) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandsMapper mapper = sqlSession.getMapper(BrandsMapper.class);
       //   当前页数
        int begin = (currentPage - 1) * pageSize;
        //处理数据
        String brandName = brand.getBrandName();
        String companyName = brand.getCompanyName();
        if(brandName != null && brandName.length() > 0){
            brand.setBrandName("%"+brandName+"%");
        }
        if(companyName != null && companyName.length() > 0){
            brand.setCompanyName("%"+companyName+"%");
        }
        //获取数据
        List<Brand> brands = mapper.selectBrandByPageAndCoundition(begin, pageSize, brand);

        int ByCountAndPage = mapper.selectByCounditionTotalCount(brand);
        //封装数据
        PageBean<Brand> brandPageBean = new PageBean<>();
        brandPageBean.setTotalCount(ByCountAndPage);
        brandPageBean.setRows(brands);
        return brandPageBean;
    }


}
