package com.demo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author FF
 * @date 2021/10/19
 * @TIME:21:27
 */
// Mybatis 快速入门
public class Demo {
    public static void main(String[] args) throws IOException {
//      构建 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        获取SqlSession对象 执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        执行sql  SQL映射文件的名称空间地址
        List<User> users = sqlSession.selectList("test.selectAll");


        System.out.println(users);

        sqlSession.close();
    }
}
