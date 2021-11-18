package com.ff.dao;

import com.ff.domain.LogCutPay;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import sun.rmi.runtime.Log;

import static com.baomidou.mybatisplus.core.assist.ISqlRunner.INSERT;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:10:41
 */
@Mapper
public interface BankLog {

    @Insert("INSERT INTO log(log,logtime,result) VALUES (#{log},now(),#{result} )")
     void banklog(String log,String result);
}
