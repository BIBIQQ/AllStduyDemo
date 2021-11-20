package com.ff.dao;

import com.ff.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 方某
 * @since 2021-11-19
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}
