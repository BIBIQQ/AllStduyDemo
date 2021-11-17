package com.ff.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author FF
 * @date 2021/11/17
 * @TIME:15:42
 */
@Configuration
public class MybatisPlusConfig {

@Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
    MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
    //分页拦截器
    mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
    //乐观锁
    mybatisPlusInterceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
    return mybatisPlusInterceptor;

}
}
