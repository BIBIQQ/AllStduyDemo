package com.ff.MyAdvice;

import com.ff.exception.BusinessException;
import com.ff.exception.SystemException;
import com.ff.domain.Code;
import com.ff.domain.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author FF
 * @date 2021/11/12
 * @TIME:12:01
 */
//声明成异常处理器类
//@RestControllerAdvice
public class ProjectExceptionAdvice {
    //声明处理哪一类异常
    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员,ex对象发送给开发人员
        return new Result(Code.SYSTEM_UNKNOW_ERR, null, "系统繁忙，请稍后再试！");
    }

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员
        return new Result(ex.getCode(), null, ex.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex) {
        return new Result(ex.getCode(), null, ex.getMessage());
    }
}
