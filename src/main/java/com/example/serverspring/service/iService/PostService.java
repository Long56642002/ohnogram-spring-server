package com.example.serverspring.service.iService;

import com.example.serverspring.model.Post;

import java.util.Collection;

public interface PostService {
    public abstract void createPost(Post post);
    public abstract Collection<Post> getPosts();
    public abstract void deletePost(String idPost);
}
