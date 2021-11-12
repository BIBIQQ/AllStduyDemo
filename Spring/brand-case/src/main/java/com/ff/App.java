package com.ff;

import com.ff.config.SpringConfig;
import com.ff.service.LogService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author FF
 * @date 2021/11/9
 * @TIME:20:04
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext acc = new AnnotationConfigApplicationContext(SpringConfig.class);
        LogService bean = acc.getBean(LogService.class);
    }
}
