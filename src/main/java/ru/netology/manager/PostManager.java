package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {
    private Post[] posts;
    Post post = new Post();

    public Post[] getPostsToArray() {
        //TODO: add logic
        return null;
    }

    public Post[] search(int ownerID, String domain, String query, boolean ownersOnly, int count, int offset) {
        //TODO: add logic
        return null;
    }

    public void delete(int postID, int ownerID) {
        //to find the post in Array and delete it
    }
}