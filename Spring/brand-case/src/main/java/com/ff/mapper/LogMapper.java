package com.ff.mapper;

import com.ff.pojo.BrandLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author FF
 * @date 2021/11/9
 * @TIME:19:25
 */
@Repository("logMapper")
public interface LogMapper {
    @Insert("INSERT INTO remove_log(time,ids,result) VALUES(now(),#{ids},#{result})")
    void addLog(@Param("ids") String ids,@Param("result") Integer result);
}
