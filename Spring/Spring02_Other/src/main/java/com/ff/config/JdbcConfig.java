package com.ff.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.ff.dao.UDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author FF
 * @date 2021/11/6
 * @TIME:23:58
 */

public class JdbcConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    //定义一个方法获得需要管理的对象
    //添加@Bean,表示当前是一个Bean
    @Bean
    public DataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return  ds;
    }
}
