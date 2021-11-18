package com.ff.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:9:39
 */
@Component
public interface BankDao {
    /**
     * 扣款操作
     * @param userAccount
     * @param cost
     * @return
     */
    @Update("updata user_account set amount = (amount - #{cost}) where userAccount = #{userAccount}")
    boolean cuyPay(@Param("userAccount")String userAccount,@Param("cost") Integer cost);
}
