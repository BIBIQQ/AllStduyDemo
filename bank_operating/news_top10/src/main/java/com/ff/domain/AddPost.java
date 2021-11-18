package com.ff.domain;

import lombok.Data;

/**
 * @author FF
 * @date 2021/11/18
 * @TIME:16:10
 */
@Data
public class AddPost {
    // 文章id
    private long id;
    // 添加类型
    private Integer status;
}
