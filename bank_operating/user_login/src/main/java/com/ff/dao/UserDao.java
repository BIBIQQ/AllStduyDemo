package com.ff.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ff.domain.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:18:48
 */
@Mapper
public interface UserDao extends BaseMapper<Employee> {


}
