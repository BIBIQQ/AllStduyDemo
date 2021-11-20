package com.ff.MyAdvice;

import com.ff.dao.MethodLogInfoDao;
import com.ff.dao.UserDao;
import com.ff.domain.MethodLogInfo;
import com.ff.domain.Result;
import com.ff.domain.User;
import lombok.Data;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author FF
 * @date 2021/11/20
 * @TIME:12:28
 */
@Component
@Aspect
public class MyAdvice {

    @Autowired
    private UserDao userDao;

    @Autowired
    private MethodLogInfoDao methodLogInfoDao;

    @Pointcut("execution(* com.ff.service.IShoppingCartService.*(..))")
    public void methodLog(){}


    /**
     * 校验用户Id  是否合规
     * 并且记录日志
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("methodLog()")
    public Object checkByUserId(ProceedingJoinPoint pjp) throws Throwable {

        MethodLogInfo methodLogInfo = new MethodLogInfo();
        //获取当前的时间
        long start = System.currentTimeMillis();
        methodLogInfo.setMethodEnd(LocalDateTime.now());
        //获得签名对象
        Signature signature = pjp.getSignature();
        //设置执行方法方法名
        methodLogInfo.setMethod(signature.getName());

        //获取参数
        Object[] args = pjp.getArgs();
        Long userId = null;
        HttpServletRequest request =null;
        for (int i = 0; i < args.length; i++) {
            Object arg = args[i];
            if(arg.getClass().equals(Long.class)){
                userId = (Long) arg;
            }else if (arg.getClass().equals(HttpServletRequest.class)){
                 request = (HttpServletRequest) arg;
            }
        }


        //校验参数是否准确
        if(userId == null){
            return Result.error("参数错误，请重新尝试");
        }
        //校验用户是否有用户信息
        User userById = userDao.selectById(userId);
        if(userById == null){
            return  Result.error("该用户没有注册,请注册后重新登录");
        }
        //执行原始方法
        Object proceed = pjp.proceed(args);

        //获取结束时间
        long end = System.currentTimeMillis();
        //获取时间差
        long methodTime =  end -start;
        //设置参数
        methodLogInfo.setMethodTime(methodTime);
        methodLogInfo.setMethodStart(LocalDateTime.now());
        methodLogInfo.setUserId(userId);
        //设置获取ip
//            methodLogInfo.setIp( request.getRemoteAddr());
//        if (request.getHeader("x-forwarded-for") == null) {
//            methodLogInfo.setIp( request.getRemoteAddr());
//        }
//            methodLogInfo.setIp(request.getHeader("x-forwarded-for"));
//        System.out.println(methodLogInfo);
        //存储日志
        methodLogInfoDao.insert(methodLogInfo);

        return proceed;
    }


}
