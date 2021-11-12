package com.ff.factory;

import com.ff.dao.UserDao;
import com.ff.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author FF
 * @date 2021/11/5
 * @TIME:15:02
 */
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    //代替原始实例工厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }
    //传递需要实现类的字节码对象
    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    /**
     * 选择是否是单例对象
     * true 单例  false 非单例
     * @return
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
