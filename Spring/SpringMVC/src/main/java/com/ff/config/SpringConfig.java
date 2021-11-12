package com.ff.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author FF
 * @date 2021/11/10
 * @TIME:11:05
 */
@Configuration
//@ComponentScan("com.ff.service")
@ComponentScan(value = "com.ff",excludeFilters = @ComponentScan.Filter(
        /*过滤规则  注解过滤*/
        type = FilterType.ANNOTATION,
        /*排除Controller注解*/
        classes = Controller.class
))
public class  SpringConfig {
}
