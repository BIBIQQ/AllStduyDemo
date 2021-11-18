package com.ff.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ff.dao.BankDao;
import com.ff.domain.User;
import com.ff.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:9:40
 */


@Service
public class BankServiceImpl extends ServiceImpl<BankDao, User> implements BankService {

    @Autowired
    private BankDao bandDao;
    /*
        账户扣款
     */
    @Override
    public boolean cuyPay(String userAccount, Integer cost) {
//        int i =1/0;
        return bandDao.cuyPay(userAccount,cost)>0;
    }
}
