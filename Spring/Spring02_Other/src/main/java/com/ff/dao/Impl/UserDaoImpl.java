package com.ff.dao.Impl;

import com.ff.dao.UDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author FF
 * @date 2021/11/6
 * @TIME:20:13
 */
//@Component("userDao")
@Repository("userDao")
//@Controller
//@Scope("prototype")
@Scope("singleton")
public class UserDaoImpl  implements UDao {

    @Override
    public void save() {
        System.out.println("user dao compnent...");
    }
    @PostConstruct
    public void init(){
        System.out.println("init..");
    }
    @PreDestroy
    public void destory(){
        System.out.println(" destory..");
    }
}
