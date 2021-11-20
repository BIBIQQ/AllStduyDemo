package com.ff.dao;

import com.ff.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * APP用户信息表 Mapper 接口
 * </p>
 *
 * @author 方某
 * @since 2021-11-18
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}
