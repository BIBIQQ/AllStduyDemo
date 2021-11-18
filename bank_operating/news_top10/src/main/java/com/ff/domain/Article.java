package com.ff.domain;

import com.baomidou.mybatisplus.annotation.TableField;
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
    private Integer authorId;

    /**
     * 作者昵称
     */
    private String authorName;

    /**
     * 文章所属频道ID
     */
    private Integer channelId;

    /**
     * 频道名称
     */
    private String channelName;

    /**
     * 文章布局	            0 无图文章	            1 单图文章	            2 多图文章
     */
    private Integer layout;

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
    private Integer provinceId;

    /**
     * 市区
     */
    private Integer cityId;

    /**
     * 区县
     */
    private Integer countyId;

    /**
     * 创建时间
     */
    private LocalDateTime createdTime;

    /**
     * 发布时间
     */
    private LocalDateTime publishTime;

    /**
     * 同步状态
     */
    private Boolean syncStatus;

    /**
     * 来源
     */
    private Boolean origin;


}
