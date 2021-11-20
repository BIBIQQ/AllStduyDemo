package com.ff.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author FF
 * @date 2021/11/19
 * @TIME:18:08
 */
@Data
@TableName("category")
public class Category {

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;
    private Integer type;
    private String name;
    private Integer sort;

}
