package com.ff.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.lang.reflect.Type;

@Data
@TableName("Book")
public class Book {
//    需要是Long
    //雪花算法
    /*
    * AUTO:利用数据库自身的自增策略
    * ASSIGN_UUID:生成一个uuid,然后将其中一个替换掉
    * ASSIGN_ID:基于时间，机器码和序列号，整合在一起形成一个8个字节的long类型的
    * */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String type;
    private String name;
    private String description;
    @TableField(value = "age",select = true)
    private Integer age;
    @TableField(exist = false)
    private Integer online;
    @TableLogic(value = "0",delval = "1")
    private Integer deleted;

    @Version
    private  Integer version;

}
