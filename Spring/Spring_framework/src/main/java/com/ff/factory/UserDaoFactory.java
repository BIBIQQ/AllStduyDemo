package com.ff.factory;

import com.ff.dao.UserDao;
import com.ff.dao.impl.UserDaoImpl;

/**
 * @author FF
 * @date 2021/11/5
 * @TIME:14:53
 */
public class UserDaoFactory {
    public  UserDao getUserDao(){
        return  new UserDaoImpl();
    }
}
