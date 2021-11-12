package com.ff.Service.Impl;

import com.ff.Service.BrandService;
import com.ff.dao.BrandDao;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author FF
 * @date 2021/11/6
 * @TIME:11:53
 */
/**
 * 多例Dao  单例Service的解决方法
 * 单例套多例  多例对象不可以通过DI注入  需要手动从容器对象获取
 * 实现ApplicationContextAware接口     创建的时候自动调用setApplicationContext方法，将容器传入
 */
public class BrandServiceImpl  implements BrandService, ApplicationContextAware {
    private BrandDao brandDao;
    private ApplicationContext ioc;

    @Override
    public void save() {

        System.out.println("BrandService = " + this);
        BrandDao brandDao = (BrandDao) ioc.getBean("brandDao");
        System.out.println("brandDao = " + brandDao);
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ioc = applicationContext;
    }
}
