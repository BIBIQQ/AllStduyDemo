package com.ff.Advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author FF
 * @date 2021/11/15
 * @TIME:19:12
 */
@Component
@Aspect
public class MyAdvice {


    @Before("execution(* com.ff.service.BookService.*(..))")
    public  void getAdvice(){
        System.out.println("before...");
    }
}
