package com.ff.until;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author FF
 * @date 2021/10/29
 * @TIME:15:46
 */
public class GetSqlSessionFactory {
        private static   SqlSessionFactory sqlSessionFactory = null;
    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
           sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  static  SqlSessionFactory GetSqlSessionFactory(){
        return sqlSessionFactory;
    }
}
