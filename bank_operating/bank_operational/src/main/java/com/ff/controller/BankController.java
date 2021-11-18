package com.ff.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ff.domain.Result;
import com.ff.domain.User;
import com.ff.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:9:52
 */

@RestController
@RequestMapping("/bank/account")
public class BankController {

    @Autowired
    private BankService bankService;

    /**
     * 账户扣款
     * @param user
     * @return
     */
    @GetMapping("/cost.do")
    Result cutPat(@RequestBody User user){
        //判断参数是否合规
        String userAccount= user.getUserAccount();
        Integer cost = user.getCost();
        //判断业务
        LambdaQueryWrapper<User> qw = new LambdaQueryWrapper<>();
        qw.eq(User::getUserAccount,userAccount);
        User one = bankService.getOne(qw);
        //判断用户是否存在或者余额
        if(one  == null){
            return new Result(false,"用户不存在",null);
        }
        //判断余额是否可以扣除
        if(one.getAmount()-cost < 0){
            return new Result(false,"余额不足",userAccount);
        }

        if(userAccount == "" || cost == null){
            return new Result(false,"参数异常，请重新输入",userAccount);
        }

        boolean falg = bankService.cuyPay(user.getUserAccount(), user.getCost());
        //返回接口内容
        return new Result(falg,falg ?"扣款成功":"扣款失败",user.getUserAccount());
    }
}
