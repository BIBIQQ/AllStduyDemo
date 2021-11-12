package com.ff.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author FF
 * @date 2021/11/10
 * @TIME:20:22
 */

@Configuration
@ComponentScan({"com.ff.controller"})
//开启Mvc容器
@EnableWebMvc
public class SpingMvcConfig {
}
