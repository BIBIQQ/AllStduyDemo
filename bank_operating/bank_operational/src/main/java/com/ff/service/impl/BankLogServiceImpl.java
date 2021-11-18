package com.ff.service.impl;

import com.ff.dao.BankLog;
import com.ff.service.BankLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:10:48
 */
@Service
public class BankLogServiceImpl implements BankLogService {
    @Autowired
    private BankLog bankLog;

    @Override
    public void bankLog(String userAccounta,Integer cost,boolean falg) {
        String log = userAccounta +"--扣款--"+cost;
        String result = falg? "扣款成功":"扣款失败";
        bankLog.banklog(log,result);
    }
}
