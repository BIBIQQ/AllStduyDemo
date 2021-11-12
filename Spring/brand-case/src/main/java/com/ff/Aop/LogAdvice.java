package com.ff.Aop;

import com.ff.mapper.LogMapper;
import com.ff.pojo.Brand;
import com.ff.pojo.BrandLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author FF
 * @date 2021/11/9
 * @TIME:20:09
 */
@Component
@Aspect
public class LogAdvice {
    @Autowired
    @Qualifier("logMapper")
    private LogMapper logMapper;

    @Pointcut("execution(*  com.ff.service.*Service.remove*(..))")
    private void logpt(){};

    @Around("LogAdvice.logpt()")
    public Object removeLog(ProceedingJoinPoint pjp)  {
        //获得参数
        Object[] args = pjp.getArgs();
        //设置参数
        String ids = "";
        for (int i = 0; i < args.length; i++) {
            Object arg = args[i];
            if(arg.getClass().equals(Integer.class)){
                ids = arg.toString();
            }else if(arg.getClass().equals(int[].class)){//批量删除判断参数是int数组类型
                ids = Arrays.toString((int[]) arg).replace("[", "").replace("]", "");
            }
        }
        //执行  单删除
        int proceed = 0;

        try {
            proceed = (int) pjp.proceed(args);
        } catch (Throwable throwable) {
            proceed = 0;
        } finally {
            //执行
            logMapper.addLog(ids,proceed > 0? 1:0);
        }

        return proceed;
    }

}
