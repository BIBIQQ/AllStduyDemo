package com.ff.web.mapper;

import com.ff.web.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author FF
 * @date 2021/10/30
 * @TIME:10:18
 */
public interface UserMapper {
    //登录
    User loginUser(@Param("user") User user);
    //增加用户
    int addUser(@Param("user") User user);
    //修改最后登录时间
    int modifyLastTime(@Param("user") User user);
    //修改用户基本信息
    int modifyUser(@Param("user") User user);
    //通过id搜索用户信息
    User showUserById(@Param("userId") Integer userId);
    //修改信息的时候 进行回显
    User showUserByUserName(@Param("userName") String userName);
    //修改用户密码
    int modifyUserPass(@Param("userId") Integer userId,@Param("userPass") String userPass);


}
