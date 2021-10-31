package com.itheima.untils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author FF
 * @date 2021/10/30
 * @TIME:10:29
 */
public class GetSqlSessionFactory {
    /*
    * 只生成一个SqlSessionFactory对象，节省内存资源
    * 单列模式
    * */
        private  static   SqlSessionFactory sqlSessionFactory = null;
    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
           sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  static   SqlSessionFactory GetSqlSessionFactory(){
            return  sqlSessionFactory;
    }
}
