package com.ff.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author FF
 * @date 2021/11/10
 * @TIME:20:21
 */
//配置类
@Configuration
//扫描注解
@ComponentScan({"com.ff.dao","com.ff.service","com.ff.aop"})
//加载第三方bean
@Import({JDBCCongfig.class,MyBatisConfig.class})
//开启AOP
@EnableAspectJAutoProxy
//开启事务
@EnableTransactionManagement
public class SpringConfig {

}
