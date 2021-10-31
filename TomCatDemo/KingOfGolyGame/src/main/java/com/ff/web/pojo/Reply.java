package com.ff.web.pojo;

/**
 * @author FF
 * @date 2021/10/30
 * @TIME:23:22
 */
/*
* 评论回复表
* */
public class Reply {

    private Integer replyId;        //回复编号
    private String replyContent;    //回复内容
    private String replyTime;   //回复时间
    private String replyUserName;   //回复人
    private Integer commentId;     //评论编号

    @Override
    public String toString() {
        return "Reply{" +
                "replyId=" + replyId +
                ", replyContent='" + replyContent + '\'' +
                ", replyTime='" + replyTime + '\'' +
                ", replyUserName='" + replyUserName + '\'' +
                ", commentId=" + commentId +
                '}';
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public String getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(String replyTime) {
        this.replyTime = replyTime;
    }

    public String getReplyUserName() {
        return replyUserName;
    }

    public void setReplyUserName(String replyUserName) {
        this.replyUserName = replyUserName;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Reply() {
    }

    public Reply(Integer replyId, String replyContent, String replyTime, String replyUserName, Integer commentId) {
        this.replyId = replyId;
        this.replyContent = replyContent;
        this.replyTime = replyTime;
        this.replyUserName = replyUserName;
        this.commentId = commentId;
    }
}
