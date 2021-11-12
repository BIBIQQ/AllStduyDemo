package com.ff.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author FF
 * @date 2021/11/7
 * @TIME:19:25
 */
//配置类
@Configuration
//加载配置类
@PropertySource("classpath:Brandmybatis.properties")
//扫描注解
@ComponentScan("com.ff")
//导入配置类
@Import({JdbcConfig.class,MybatisConfig.class})
//开启事务管理
@EnableTransactionManagement
//开启AOP
@EnableAspectJAutoProxy
public class SpringConfig {

}
