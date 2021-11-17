package com.ff.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("tbl_brand")
public class Brand {
    // id 主键
    @TableId(type = IdType.AUTO)
    private Long id;
    // 品牌名称
    private String brandName;
    // 企业名称
    private String companyName;
    // 排序字段
    private Integer ordered;
    // 描述信息
    private String description;
    // 状态：0：禁用  1：启用
    private Integer status;

    @TableLogic(value = "0",delval = "1")
    private Integer deleted;

    @Version
    private  Integer version;


    //逻辑视图
    public String getStatusStr(){
        if (status == null){
            return "未知";
        }
        return status == 0 ? "禁用":"启用";
    }

}
