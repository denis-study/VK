package ru.netology.domain;

public class RepostsInfo {
    private int count;
    private boolean userReposted;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserReposted() {
        return userReposted;
    }
    public void setUserLikes(boolean userReposted) {
        this.userReposted = userReposted;
    }
}