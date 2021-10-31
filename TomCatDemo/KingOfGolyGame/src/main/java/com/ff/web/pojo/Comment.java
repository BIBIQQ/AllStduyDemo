package com.ff.web.pojo;

/**
 * @author FF
 * @date 2021/10/30
 * @TIME:23:19
 */
/*
* 帖子评价表
* */
public class Comment {
    private Integer commentId;      // 评论编号
    private String commentContent;      //评论内容
    private String commentTime;     //评论时间
    private String commentUserName; //评论人
    private Integer commentStatus;  // 评论状态，1代表屏蔽，0代表解除
    private Integer articleId;      // 帖子编号


    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", commentContent='" + commentContent + '\'' +
                ", commentTime='" + commentTime + '\'' +
                ", commentUserName='" + commentUserName + '\'' +
                ", commentStatus=" + commentStatus +
                ", articleId=" + articleId +
                '}';
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentUserName() {
        return commentUserName;
    }

    public void setCommentUserName(String commentUserName) {
        this.commentUserName = commentUserName;
    }

    public Integer getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Integer commentStatus) {
        this.commentStatus = commentStatus;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Comment() {
    }

    public Comment(Integer commentId, String commentContent, String commentTime, String commentUserName, Integer commentStatus, Integer articleId) {
        this.commentId = commentId;
        this.commentContent = commentContent;
        this.commentTime = commentTime;
        this.commentUserName = commentUserName;
        this.commentStatus = commentStatus;
        this.articleId = articleId;
    }
}
