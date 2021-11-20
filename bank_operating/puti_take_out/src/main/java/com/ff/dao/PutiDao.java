package com.ff.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ff.domain.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author FF
 * @date 2021/11/19
 * @TIME:18:15
 */

@Mapper
public interface PutiDao extends BaseMapper<Category> {

}
