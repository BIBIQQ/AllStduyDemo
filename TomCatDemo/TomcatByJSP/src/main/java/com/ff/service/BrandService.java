package com.ff.service;

import com.ff.mapper.BrandMappr;
import com.ff.pojo.Brands;
import com.ff.until.GetSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author FF
 * @date 2021/10/29
 * @TIME:16:04
 */
public class BrandService {

    public List<Brands> findAll() {
        //获取配置
        SqlSessionFactory sqlSessionFactory = GetSqlSessionFactory.GetSqlSessionFactory();
        //连接
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMappr mapper = sqlSession.getMapper(BrandMappr.class);
        //执行sql
        List<Brands> all = mapper.findAll();

        //返回值
        return all;

    }

    public boolean addBrand(Brands brands){
        //获取配置
        SqlSessionFactory sqlSessionFactory = GetSqlSessionFactory.GetSqlSessionFactory();
        //连接
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMappr mapper = sqlSession.getMapper(BrandMappr.class);
        //执行sql
        int i = mapper.addBrand(brands);
        sqlSession.commit();
        if(i>0){
            return true;
        }else {
            return  false;
        }
    }

    public boolean removeBrand(String id){

        if( id ==null || id == ""){
            return false;
        }

        //获取配置
        SqlSessionFactory sqlSessionFactory = GetSqlSessionFactory.GetSqlSessionFactory();
        //连接
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMappr mapper = sqlSession.getMapper(BrandMappr.class);
        //执行sql
        int i = mapper.removeBrand(Integer.parseInt(id));
        sqlSession.commit();
        if(i>0){
            return true;
        }else {
            return  false;
        }

    }

    /*
    * 获取单个用户用户来回显
    * 参数：用户ID
    * */
    public Brands selectById(String id){
        //获取配置
        SqlSessionFactory sqlSessionFactory = GetSqlSessionFactory.GetSqlSessionFactory();
        //连接
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMappr mapper = sqlSession.getMapper(BrandMappr.class);
        //执行sql
        Brands brands = mapper.selectById(Integer.parseInt(id));
        return brands;
    }

    /*
    * 修改所有用户数据
    * 参数：Brands对象
    *
    * */
    public boolean modifiBrand (Brands brands){
        //获取配置
        SqlSessionFactory sqlSessionFactory = GetSqlSessionFactory.GetSqlSessionFactory();
        //连接
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMappr mapper = sqlSession.getMapper(BrandMappr.class);
        //执行sql
        int i = mapper.modifiBrand(brands);
        sqlSession.commit();
        if (i>0){
            return true;
        }else {
            return false;
        }

    }
}
