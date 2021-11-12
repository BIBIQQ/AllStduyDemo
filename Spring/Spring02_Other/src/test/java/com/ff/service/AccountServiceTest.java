package com.ff.service;

import com.ff.config.SpringConfig;
import com.ff.domain.Acount;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.List;

/**
 * @author FF
 * @date 2021/11/7
 * @TIME:18:36
 */
//设置主运行
@RunWith(SpringJUnit4ClassRunner.class)
//导入配置类
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {
    @Autowired
    private  AccountService accountService;
    @Test
    public void findAll(){
        Acount acount = accountService.selectAcount(1);
        System.out.println(acount);
    }
}
