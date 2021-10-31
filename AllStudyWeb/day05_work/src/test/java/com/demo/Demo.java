package com.demo;

import com.mapper.BrandMapper;
import com.pojo.Brand;
import com.sun.javafx.collections.MappingChange;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author FF
 * @date 2021/10/20
 * @TIME:19:14
 */
public class Demo {
    SqlSession sqlSession = null;
    BrandMapper mapper = null;

    @Before
    public void befter() throws IOException {
        //    获取 sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //          获得对象，执行sql
        //        默认是手动提交事务，需要手动 提交    true 自动  false 手动
        sqlSession = sqlSessionFactory.openSession(false);
        mapper = sqlSession.getMapper(BrandMapper.class);
    }

//分页
    @Test
    public  void limit(){
        int page = 2;
        int pageSize =2;
        int pageIn = (page -1) * pageSize;
        List<Brand> limit = mapper.limit(pageIn, pageSize);

        for (Brand brand : limit) {
            System.out.println(brand);
        }
    }

//  搜索状态
    @Test
    public void Bystatus() {
        int status = 2;
        List<Brand> bystatus = mapper.Bystatus(status);
        System.out.println(bystatus);
    }
//    主页
    @Test
    public void Byall(){
        List<Brand> byall = mapper.Byall();
        for (Brand brand : byall) {
            System.out.println(brand);
        }

    }

//    多条件搜索
    @Test
    public  void  Bymuch(){
        String userCall =  "15557849397";
        String starTime = "2021-10-21";
        String endTime = "2021-10-23";
        String message = "快";
        message = "%" +message+"%";

        Map map = new HashMap();

//        map.put("userCall",userCall);
//        map.put("starTime",starTime);
//        map.put("endTime",endTime);
        map.put("message",message);

        List<Brand> bymuch = mapper.Bymuch(map);

        for (Brand brand : bymuch) {
            System.out.println(brand);
        }

    }
    @Test
    public void adds() {


    }

    @Test
    public  void selectSingle(){


    }

    @After
    public void after() {
        //        释放资源
        sqlSession.commit();
        sqlSession.close();
    }
}

