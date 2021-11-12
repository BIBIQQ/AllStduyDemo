package com.ff.service.Impl;

import com.ff.dao.UDao;
import com.ff.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author FF
 * @date 2021/11/6
 * @TIME:20:14
 */
//@Component
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userDao")
    private UDao userDao;

    @Value("${jdbc.driver}")
    private String name;

  /*  public void setUserDao(UDao userDao) {
        this.userDao = userDao;
    }*/

    @Override
    public void save() {
        System.out.println("name = " + name);
        System.out.println("user service save ...");
        userDao.save();
    }
}
