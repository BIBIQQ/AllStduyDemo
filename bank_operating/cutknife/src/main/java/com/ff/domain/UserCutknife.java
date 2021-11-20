package com.ff.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:21:11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("user_cut_knife")
public class UserCutknife {
    //'用户ID'
    private Integer userId;
    //'砍价订单ID'
    private Integer cutId;
    //帮砍金额'
    private Double cutMoney;



}
