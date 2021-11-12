package com.ff.service.Impl;

import com.ff.dao.AccountDao;
import com.ff.domain.Acount;
import com.ff.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author FF
 * @date 2021/11/6
 * @TIME:23:53
 */
@Service
public class AccountServiceImpl  implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public Acount selectAcount(Integer id) {
        return accountDao.selectAcount(id);
    }

    @Override
    public void save(Acount acount) {
        accountDao.save(acount);
    }

    @Override
    public void delete(Integer id) {
        accountDao.delete(id);
    }

    @Override
    public void updata(Acount acount) {
        accountDao.updata(acount);
    }

    @Override
    public List<Acount> findAll() {
        return accountDao.findAll();
    }
}
