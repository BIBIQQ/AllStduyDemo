package com.ff.aop;

import com.ff.service.LogService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author FF
 * @date 2021/11/11
 * @TIME:17:25
 */
@Aspect
@Component
public class RemoveLog {


    @Autowired
    private LogService logService;

    @Pointcut("execution(*  com.ff.service.BrandService.remove*(..))")
    private void removept() { }


    //删除日志
    @Around("RemoveLog.removept()")
    public Object removeLog(ProceedingJoinPoint pjp) {
        System.out.println("111");
        //获得参数
        Object[] args = pjp.getArgs();
        //设置参数
        String ids = "";
        for (int i = 0; i < args.length; i++) {
            Object arg = args[i];
            if(arg.getClass().equals(Integer.class)){
                ids = arg.toString();
                break;
            }else if(arg.getClass().equals(int[].class)){//批量删除判断参数是int数组类型
                ids = Arrays.toString((int[]) arg).replace("[", "").replace("]", "");
                break;
            }
        }
        //执行  单删除
        int proceed = 0;

        try {
            //调用目标对象
            proceed = (int) pjp.proceed(args);
            System.out.println("222");
        } catch (Throwable throwable) {
            System.out.println("333");
            proceed = 0;
            //将目标方法的异常捕获掉处理了，不会再交给别人
            throwable.printStackTrace();
            //手动将异常抛出，交给事务，捕获异常，进行回滚
            throw new RuntimeException(throwable);

        } finally {
            System.out.println("444");
            //执行
            logService.removeLog(ids,proceed > 0? 1:0);
        }

        return proceed;
    }
}
