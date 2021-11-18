package com.ff.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ff.domain.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:9:40
 */
public interface BankService extends IService<User> {
    @Transactional
    boolean cuyPay(String userAccount,Integer cost);
}
