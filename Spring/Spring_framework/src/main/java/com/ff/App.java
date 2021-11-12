package com.ff;

import com.ff.Service.BookService;
import com.ff.Service.BrandService;
import com.ff.Service.DIService;
import com.ff.Service.Impl.BookServiceImpl;
import com.ff.dao.BookDao;
import com.ff.dao.BrandDao;
import com.ff.dao.OrderDao;
import com.ff.dao.UserDao;
import com.ff.factory.OrderDaoFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;

/**
 * @author FF
 * @date 2021/11/5
 * @TIME:10:41
 */
public class App {
    /**
     * 没有Bean
     */
    @Test
    public  void app1() {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }

    /**
     * 方法一 配置单个Bean
     */
    @Test
    public void app2(){
       //获取IDO容器
        ApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取Bean
        BookDao bookDao = (BookDao) ca.getBean("bookDao");
        bookDao.save();
        BookService bookService = (BookService) ca.getBean("bookService");
        bookService.save();
    }

    /**
     * 方法二  静态工厂
     */
    @Test
    public void app3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = (OrderDao) ac.getBean("orderDao");
        orderDao.sava();
    }
    /**
     * 方法三    实例化工厂实例化Bean
     */
    @Test
    public void app4(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) ac.getBean("userDao");
        userDao.save();
    }
    /**
     *方法四   使用FactoryBean实例化工厂
     */
    @Test
    public void app5(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDaoFactoryBean = (UserDao) ac.getBean("userDaoFactoryBean");
        userDaoFactoryBean.save();
    }
    /**
     * 控制生命周期
     */
    @Test
    public void app6(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//       设置关闭标记
        ac.registerShutdownHook();
        BookDao bookDao = (BookDao) ac.getBean("bookDao");
        bookDao.save();
//        关闭容器 比较暴力
//        ac.close();

    }

    /**
     * 多例Dao  单例Service的解决方法
     */
    @Test
    public void app7(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        BrandDao brandDao = (BrandDao) ac.getBean("brandDao");
        brandDao.save();
        System.out.println("brandDao = " + brandDao);
        BrandService brandService = (BrandService) ac.getBean("brandService");
        brandService.save();
        System.out.println(brandService);
    }

    /**
     * 多种注入方法
     */
    @Test
    public void app8(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        DIService diService = (DIService) ioc.getBean("diService");
        diService.save();
    }
}
