package com.ff.Advice;

import com.ff.dao.BankLog;
import com.ff.domain.User;
import com.ff.service.BankLogService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author FF
 * @date 2021/11/15
 * @TIME:19:12
 */

/**
 * AOP
 * 1. 执行日志程序
 *
 */
@Component
@Aspect
public class MyAdvice {

    @Autowired
    private BankLogService bankLogService;

    /**
     * 执行删除日志
     * @param pjp
     * @return
     */
    @Around("execution(* com.ff.service.BankService.cuy*(..))")
    public  Object getAdvice(ProceedingJoinPoint pjp){
        //获取参数
        Object[] args = pjp.getArgs();
        //获取用户账号和扣款金额
        String userAccount = null;
        Integer cost = 0;
        //判断数值类型
        for (int i = 0; i < args.length; i++) {
            Object arg = args[i];

            if (arg.getClass().equals(String.class)){
                userAccount = (String) arg;
            }else if(arg.getClass().equals(Integer.class)&& (Integer)arg>0){
                cost = (Integer) arg;
            }
        }
        //定义初始化返回值
        Boolean proceed =false;
        try {
            //执行捕获程序
             proceed = (Boolean) pjp.proceed();
        } catch (Throwable throwable) {
            //抛出异常
            //可以抛出异常码
            throwable.printStackTrace();
        }finally {
            //执行日志
            bankLogService.bankLog(userAccount,cost,proceed);
        }
        //返回 返回值
        return proceed;
    }
}
