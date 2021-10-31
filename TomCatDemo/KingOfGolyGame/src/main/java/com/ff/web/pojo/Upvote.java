package com.ff.web.pojo;

/**
 * @author FF
 * @date 2021/10/30
 * @TIME:23:25
 */
/*
* 点赞表
* */
public class Upvote {
    private String  upvoteUserName; //点赞人
    private Integer  upvoteArticleId;   //点赞帖子
    private Integer  isUpvote;      //点赞状态，0代表未点赞，1代表已点赞（默认）

    @Override
    public String toString() {
        return "Upvote{" +
                "upvoteUserName='" + upvoteUserName + '\'' +
                ", upvoteArticleId=" + upvoteArticleId +
                ", isUpvote=" + isUpvote +
                '}';
    }

    public String getUpvoteUserName() {
        return upvoteUserName;
    }

    public void setUpvoteUserName(String upvoteUserName) {
        this.upvoteUserName = upvoteUserName;
    }

    public Integer getUpvoteArticleId() {
        return upvoteArticleId;
    }

    public void setUpvoteArticleId(Integer upvoteArticleId) {
        this.upvoteArticleId = upvoteArticleId;
    }

    public Integer getIsUpvote() {
        return isUpvote;
    }

    public void setIsUpvote(Integer isUpvote) {
        this.isUpvote = isUpvote;
    }

    public Upvote() {
    }

    public Upvote(String upvoteUserName, Integer upvoteArticleId, Integer isUpvote) {
        this.upvoteUserName = upvoteUserName;
        this.upvoteArticleId = upvoteArticleId;
        this.isUpvote = isUpvote;
    }
}
