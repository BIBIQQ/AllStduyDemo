package com.ff.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author FF
 * @date 2021/11/6
 * @TIME:20:43
 */
//配置类
@Configuration
//扫描
@ComponentScan("com.ff")
//加载properties文件
@PropertySource("mybatis.properties")
//导入第三方配置类
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {

}
