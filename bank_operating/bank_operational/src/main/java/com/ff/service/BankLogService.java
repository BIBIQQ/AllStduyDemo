package com.ff.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:10:48
 */
public interface BankLogService {
    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRES_NEW)
    void bankLog(String userAccounta,Integer cost,boolean falg);
}
