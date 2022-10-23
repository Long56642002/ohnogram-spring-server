package com.example.serverspring.service.iService;

import com.example.serverspring.model.Post;
import com.example.serverspring.model.User;

import java.util.Collection;

public interface PostService {
    public abstract void createPost(Post post);
    public abstract Iterable<Post> getPosts();
    public abstract void deletePost(String idPost);
    public abstract Iterable<Post> getFollowingPosts(User user);
}
