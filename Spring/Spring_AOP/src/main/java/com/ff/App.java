package com.ff;

import com.ff.config.SpringConfig;
import com.ff.dao.BookDao;
import com.ff.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author FF
 * @date 2021/11/8
 * @TIME:15:26
 */
public class App {
    /**
     * Aop入门案例
     */
    @Test
    public  void app1(){
        ApplicationContext aop = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = aop.getBean(BookDao.class);
//        System.out.println("bookDao = " + bookDao);
//        System.out.println("bookDao.getClass() = " + bookDao.getClass());
        bookDao.updata();
        bookDao.save();
    }

    /**
     * 百度网盘确认验证码
     */
    @Test
    public void app2(){
        ApplicationContext aop = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookDao = aop.getBean(BookService.class);
        bookDao.result("http://www.wangpang/xxx/xxx/xxx", "root");


    }
}
