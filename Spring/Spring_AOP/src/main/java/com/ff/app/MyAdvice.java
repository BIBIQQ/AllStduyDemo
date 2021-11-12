package com.ff.app;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author FF
 * @date 2021/11/8
 * @TIME:15:32
 */
@Component
//通知类
@Aspect
public class MyAdvice {

    //定义切入点   参数    需要切入的方法
    @Pointcut("execution(void com.ff.dao.BookDao.*())")
    private void pt() {
    }
    //定义切入点   参数    需要切入的方法
    @Pointcut("execution(void com.ff.service.*Service.*(..))")
    private void pt2() {}


    //绑定切入点和共性方法的关系
    //设置在执行之前
//    @Before("pt()")
    public void mehtod(JoinPoint jp){
        //获取参数
        Object[] args = jp.getArgs();
        System.out.println(System.currentTimeMillis());
    }

    //设置在执行之后
//    @After("pt()")
    public void after() {
        System.out.println(System.currentTimeMillis());
    }

    //环绕通知 前后都有
    //参数  代理的原始方法
    //切入点有返回值   通知需要同步返回
//    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println("around before..");
        //对原始方法的调用
        pjp.proceed();
        System.out.println("around after...");
    }

    //方法正常结束好后才会执行
//    @AfterReturning(value = "pt()",returning = "ret")
    public void afterReturning(JoinPoint jp,String ret) {
        System.out.println("afterReturning....."+ret);
    }

    //抛出异常后执行
//    @AfterThrowing(value = "pt()",throwing = "t")
    public void afterThrowing(Throwable t) {
        System.out.println("afterThrowing...."+t);
    }

    //接口执行效率
//    @Around("pt()")
    public void timeResult(ProceedingJoinPoint pjp) throws Throwable {
        //一次执行的签名信息
        Signature signature = pjp.getSignature();
        //类型名
        String classname = signature.getDeclaringTypeName();
        //方法名
        String name = signature.getName();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            pjp.proceed();
        }
        long endTime = System.currentTimeMillis();
        long resultTimme = endTime - startTime;
        System.out.println("执行时间：" + classname + "." + name + "----->" + resultTimme + "ms");

    }

    //Around 五类通知整合
//    @Around("pt()")
    public Object aroundAll(ProceedingJoinPoint pjp) {
        Object proceed = null;
        try {
            System.out.println("前置..");
            //对原始方法的调用
            proceed = pjp.proceed();
            System.out.println("返回后...");
        } catch (Exception e) {
            System.out.println("异常通知...");
        } catch (Throwable throwable) {
            System.out.println("异常通知...");
        } finally {
            System.out.println("后置通知...");
        }
        return proceed;
    }

    /**
     * 百度网盘验证验证码
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("MyAdvice.pt2()")
    public Object trimStr(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++) {
            if(args[i].getClass().equals(String.class)){
                args[i] = args[i].toString().trim();
            }
        }
        return pjp.proceed(args);
    }
}