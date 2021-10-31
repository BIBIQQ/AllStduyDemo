package com.demo;

import com.mapper.BrandMapper;
import com.pojo.Brand;
import com.pojo.Prouduct;
import com.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author FF
 * @date 2021/10/25
 * @TIME:18:54
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
    @Test
    public void getUser(){
        int id = 1;
        User user = mapper.getUser(id);
        System.out.println(user);
    }
    @Test
    public void getProduct(){
        int id = 1;
        Prouduct product = mapper.getProduct(id);
        System.out.println(product);
    }
    @Test
    public void findUserProductByUserId(){
        int userId = 1;
        List<Prouduct> userProductByUserId = mapper.findUserProductByUserId(userId);
//        System.out.println(userProductByUserId);
        for (Prouduct prouduct : userProductByUserId) {
            System.out.println(prouduct);
        }
    }

    @After
    public void after() {
      sqlSession.commit();
      sqlSession.close();
    }
}
