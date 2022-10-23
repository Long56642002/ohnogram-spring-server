package com.example.serverspring.service;

import com.example.serverspring.model.Post;
import com.example.serverspring.model.User;
import com.example.serverspring.repository.PostRepository;
import com.example.serverspring.service.iService.PostService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public void createPost(Post post) {
        postRepository.save(post);
    }

    @Override
    public Iterable<Post> getPosts() {
        Iterable<Post> postCollection = postRepository.findAll();
        postCollection.forEach(post -> post.setIdString(post.getId().toString()));
        return postCollection;
    }

    @Override
    public void deletePost(String idPost) {
        postRepository.deleteById(new ObjectId(idPost));
    }

    @Override
    public Iterable<Post> getFollowingPosts(User user) {
        return postRepository.findAllById(user.getFollowing().stream().map(u -> u.getId()).collect(Collectors.toList()));
    }
}
