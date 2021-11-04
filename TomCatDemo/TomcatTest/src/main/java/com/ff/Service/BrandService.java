package com.ff.Service;

import com.ff.mapper.BrandMapper;
import com.ff.pojo.Brand;
import com.ff.untils.GetSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author FF
 * @date 2021/11/1
 * @TIME:19:55
 */
public class BrandService {
    SqlSessionFactory sqlSessionFactory = GetSqlSessionFactory.GetSqlSessionFactory();
    /*
    * 获取所有商品
    * @return   List<Brand>
    *
    * */
    public List<Brand> findAllBrands(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> allBrand = mapper.findAllBrand();
        return allBrand;
    }

    /*
    * 增加商品
    * @Param  Brand
    * @return boolean
    * */
    public boolean addBrand(Brand brand){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        int i = mapper.addBrand(brand);
        if (i>0){
            sqlSession.commit();
        }
        return i>0;
    }
    /*
    * 搜索id商品进行回显
    * @Param Brand
    * @return boolean
    * */
    public Brand selectBrandById(Brand brand) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
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
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        int i = mapper.modifyBrand(brand);
        if(i>0){
            sqlSession.commit();
        }
        return i >0;
    }
    /*
    * 删除商品
    * @Param id
    * @return boolean
    * */
    public boolean removeBrandById(Brand brand){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
       int i = mapper.removeBrandById(brand);
       if(i>0){
           sqlSession.commit();
       }

       return i>0;
    }
}
