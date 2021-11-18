package com.baomidou.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 文章信息表，存储已发布的文章
 * </p>
 *
 * @author 方某
 * @since 2021-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ap_article")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 文章作者的ID
     */
    private Integer author_id;

    /**
     * 作者昵称
     */
    private String author_name;

    /**
     * 文章所属频道ID
     */
    private Integer channel_id;

    /**
     * 频道名称
     */
    private String channel_name;

    /**
     * 文章布局	            0 无图文章	            1 单图文章	            2 多图文章
     */
    private Boolean layout;

    /**
     * 文章标记	            0 普通文章	            1 热点文章	            2 置顶文章	            3 精品文章	            4 大V 文章
     */
    private Integer flag;

    /**
     * 文章图片	            多张逗号分隔
     */
    private String images;

    /**
     * 文章标签最多3个 逗号分隔
     */
    private String labels;

    /**
     * 点赞数量
     */
    private Integer likes;

    /**
     * 收藏数量
     */
    private Integer collection;

    /**
     * 评论数量
     */
    private Integer comment;

    /**
     * 阅读数量
     */
    private Integer views;

    /**
     * 省市
     */
    private Integer province_id;

    /**
     * 市区
     */
    private Integer city_id;

    /**
     * 区县
     */
    private Integer county_id;

    /**
     * 创建时间
     */
    private LocalDateTime created_time;

    /**
     * 发布时间
     */
    private LocalDateTime publish_time;

    /**
     * 同步状态
     */
    private Boolean sync_status;

    /**
     * 来源
     */
    private Boolean origin;


}
