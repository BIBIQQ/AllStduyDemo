package com.ff.web.pojo;

/**
 * @author FF
 * @date 2021/10/30
 * @TIME:23:12
 */
/*
* 帖子信息
* */
public class Article {
    private  Integer articleId; // 帖子编号
    private  String title;      //  标题
    private  String content;        // 内容
    private  String sendTime;       //发送时间
    private  String senderName;     //发送人编号
    private  Integer isTop;         // 是否置顶，如果是0，代表不置顶；如果是1，代表置顶；
    private  Integer replyCount;    // 评论数
    private  Integer upvoteCount;    //点赞数
    private  Integer browseCount;   //浏览数
    private  Integer zoneId;    //所在交流区

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", sendTime='" + sendTime + '\'' +
                ", senderName='" + senderName + '\'' +
                ", isTop=" + isTop +
                ", replyCount=" + replyCount +
                ", upvoteCount=" + upvoteCount +
                ", browseCount=" + browseCount +
                ", zoneId=" + zoneId +
                '}';
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public Integer getIsTop() {
        return isTop;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public Integer getUpvoteCount() {
        return upvoteCount;
    }

    public void setUpvoteCount(Integer upvoteCount) {
        this.upvoteCount = upvoteCount;
    }

    public Integer getBrowseCount() {
        return browseCount;
    }

    public void setBrowseCount(Integer browseCount) {
        this.browseCount = browseCount;
    }

    public Integer getZoneId() {
        return zoneId;
    }

    public void setZoneId(Integer zoneId) {
        this.zoneId = zoneId;
    }

    public Article() {
    }

    public Article(Integer articleId, String title, String content, String sendTime, String senderName, Integer isTop, Integer replyCount, Integer upvoteCount, Integer browseCount, Integer zoneId) {
        this.articleId = articleId;
        this.title = title;
        this.content = content;
        this.sendTime = sendTime;
        this.senderName = senderName;
        this.isTop = isTop;
        this.replyCount = replyCount;
        this.upvoteCount = upvoteCount;
        this.browseCount = browseCount;
        this.zoneId = zoneId;
    }
}
