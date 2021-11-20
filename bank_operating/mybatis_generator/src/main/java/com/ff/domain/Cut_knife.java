package com.ff.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 方某
 * @since 2021-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ap_cut_knife")
public class Cut_knife implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 砍价订单ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Integer id;

    /**
     * 订单总金额
     */
    private Double money;

    /**
     * 已砍金额
     */
    private Double knifeMoney;

    /**
     * 已砍人数
     */
    private Integer knifeRen;

    /**
     * 用户id外键
     */
    private Integer userId;


}
