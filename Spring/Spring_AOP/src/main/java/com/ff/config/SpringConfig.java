package com.ff.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author FF
 * @date 2021/11/8
 * @TIME:15:26
 */
//配置类
@Configuration
//扫描注解
@ComponentScan("com.ff")
//告知配置类有通知类
@EnableAspectJAutoProxy
public class SpringConfig {
}
