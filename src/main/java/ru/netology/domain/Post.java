package ru.netology.domain;

public class Post {

    private int postID;
    private int FromID;
    private int ownerID;  //id владельца стены. на которой размещена запись
    private int postTime;// дата в формате unixtime
    private String text;
    private int replyOwnerID;
    private int replyPostID;
    private int signedID; //если от имени сообщества, но подписано автором
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavourite;
    private String postType;

    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private ViewsInfo viewsInfo;
    private GeoInfo geoInfo;
    private RepostsInfo repostsInfo;


    public int getPostID() {
        return postID;
    }
    public void setPostID(int postID) {
        this.postID = postID;
    }


    public int getAuthorID() {
        return FromID;
    }
    public void setAuthorID(int fromID) {
        FromID = fromID;
    }


    public int getOwnerID() {
        return ownerID;
    }
    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }


    public int getPostTime() {
        return postTime;
    }
    public void setPostTime(int postTime) {
        this.postTime = postTime;
    }


    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }


    public int getReplyOwnerID() {
        return replyOwnerID;
    }
    public void setReplyOwnerID(int replyOwnerID) {
        this.replyOwnerID = replyOwnerID;
    }


    public int getReplyPostID() {
        return replyPostID;
    }
    public void setReplyPostID(int replyPostID) {
        this.replyPostID = replyPostID;
    }


    public int getSignedID() {
        return signedID;
    }
    public void setSignedID(int signedID) {
        this.signedID = signedID;
    }


    public boolean isCanPin() {
        return canPin;
    }
    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }


    public boolean isCanDelete() {
        return canDelete;
    }
    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }


    public boolean isCanEdit() {
        return canEdit;
    }
    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }


    public boolean isPinned() {
        return isPinned;
    }
    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }


    public boolean isMarkedAsAds() {
        return markedAsAds;
    }
    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }


    public boolean isFavourite() {
        return isFavourite;
    }
    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }


    public String getPostType() {
        return postType;
    }
    public void setPostType(String postType) {
        this.postType = postType;
    }


    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }
    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }
    public void setLikesService(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }
    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public GeoInfo getGeoInfo() {
        return geoInfo;
    }
    public void setGeoInfo(GeoInfo geoInfo) {
        this.geoInfo = geoInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }
    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }
}

