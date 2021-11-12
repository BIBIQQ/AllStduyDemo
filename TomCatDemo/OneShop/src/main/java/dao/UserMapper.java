package dao;

import org.apache.ibatis.annotations.Select;
import pojo.User;

/**
 * @author FF
 * @date 2021/11/4
 * @TIME:20:14
 */
public interface UserMapper {

    @Select("select * from t_user where username=#{username} and password=#{password}")
    User Login(User user);
}
