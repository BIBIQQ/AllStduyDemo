package com.itheima.until;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author FF
 * @date 2021/10/28
 * @TIME:19:10
 */
public class SqlSessionFactoryByUntil {
    private  static  SqlSessionFactory sqlSessionFactory = null;
    static {
        try {
            String xml = "mybatis-config.xml";
            InputStream resourceAsStream = Resources.getResourceAsStream(xml);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static  SqlSessionFactory  sqlSessionFactoryByUntil(){
        return sqlSessionFactory;
    }
}
