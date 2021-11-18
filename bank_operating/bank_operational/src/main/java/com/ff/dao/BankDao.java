package com.ff.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ff.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:9:39
 */
@Mapper
public interface BankDao extends BaseMapper<User> {
    /**
     * 扣款操作
     * @param userAccount
     * @param cost
     * @return
     */
    @Update("UPDATE user_account SET amount = (amount - #{cost}) WHERE userAccount = #{userAccount}")
    int cuyPay(@Param("userAccount")String userAccount,@Param("cost") Integer cost);
}
