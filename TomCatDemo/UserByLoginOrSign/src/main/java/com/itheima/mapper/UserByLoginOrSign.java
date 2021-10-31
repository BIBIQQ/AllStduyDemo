package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author FF
 * @date 2021/10/28
 * @TIME:19:06
 */
public interface UserByLoginOrSign {

    User loginByUser(@Param("userName") String userName, @Param("userPass") String userPass);

    int addByUser(User user);

    @Select("SELECT * FROM bbs_user_table WHERE userName = #{userName}")
    User selectByUser(@Param("userName") String userName);
}
