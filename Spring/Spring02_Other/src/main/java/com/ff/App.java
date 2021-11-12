package com.ff;

import com.ff.config.SpringConfig;
import com.ff.dao.AccountDao;
import com.ff.dao.BookDao;
import com.ff.dao.UDao;
import com.ff.domain.Acount;
import com.ff.service.AccountService;
import com.ff.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author FF
 * @date 2021/11/6
 * @TIME:18:43
 */
public class App {
    /**
     * 如何使用第三方的Bean
     */

    public void app1() {
        ApplicationContext ios = new ClassPathXmlApplicationContext("applicationContext.xml.bak");
        DataSource dataSource = (DataSource) ios.getBean("dataSoure");
        System.out.println(dataSource);
    }

    /**
     * 加载properies文件
     */

    public void app2() {
        ApplicationContext ios = new ClassPathXmlApplicationContext("applicationContext.xml.bak");
        BookDao bookDao = (BookDao) ios.getBean("bookDao");
    /*    BookDao bookDao = (BookDao) ios.getBean("bookDao",BookDao.class);
        BookDao bookDao = (BookDao) ios.getBean(BookDao.class);*/
        bookDao.save();
    }

    /**
     * 注解开发
     */

    public void app3() {
        ApplicationContext ios = new ClassPathXmlApplicationContext("applicationContext.xml.bak");
        UDao userDao = (UDao) ios.getBean("userDao");
        System.out.println(userDao);
        UserService userService = ios.getBean(UserService.class);
        System.out.println(userService);
        userService.save();
    }

    /**
     * 注解配置类开发
     */
    @Test
    public void app4() {
        ApplicationContext ios = new AnnotationConfigApplicationContext(SpringConfig.class);
        UDao userDao1 = (UDao) ios.getBean("userDao");
        System.out.println(userDao1);
        UserService userService = ios.getBean(UserService.class);
        System.out.println(userService);
        userService.save();
    }

    /**
     * mybatis  注解开发
     */
    @Test
    public void app5() throws IOException {
        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //加载mybatis-config.xml文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
        //获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行获取SqlSession对象查询
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);

        Acount acount = mapper.selectAcount(2);
        System.out.println(acount);

        //结束资源
        sqlSession.close();
    }

    /**
     * 配置类注解开发
     */
    @Test
    public void app6() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService accountService = ctx.getBean(AccountService.class);
        Acount acount = accountService.selectAcount(2);
        System.out.println(acount);
    }

}
