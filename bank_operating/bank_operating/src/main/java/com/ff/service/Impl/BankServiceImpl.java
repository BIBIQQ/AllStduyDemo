package com.ff.service.Impl;

import com.ff.dao.BankDao;
import com.ff.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:9:40
 */

@Service
public class BankServiceImpl implements BankService {

    @Autowired
    private BankDao bandDao;

    @Override
    public boolean cuyPay(String userAccount, Integer cost) {
        return bandDao.cuyPay(userAccount,cost);
    }
}
