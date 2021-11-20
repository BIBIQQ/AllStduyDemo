package com.ff.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ff.domain.UserCutknife;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:23:29
 */
@Mapper
public interface UserCutknifeDao  extends BaseMapper<UserCutknife> {
    @Insert("INSERT INTO user_cut_knife VALUES (#{userId},#{cutId},#{cutMoney})")
    void addCutknife(UserCutknife userCutknife);
}
