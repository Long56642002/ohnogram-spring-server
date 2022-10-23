package com.example.serverspring.service;

import com.example.serverspring.model.Post;
import com.example.serverspring.repository.PostRepository;
import com.example.serverspring.service.iService.PostService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public void createPost(Post post) {
        postRepository.save(post);
    }

    @Override
    public Collection<Post> getPosts() {
        Collection<Post> postCollection = postRepository.findAll();
        postCollection.forEach(post -> post.setIdString(post.getId().toString()));
        return postCollection;
    }

    @Override
    public void deletePost(String idPost) {
        postRepository.deleteById(new ObjectId(idPost));
    }
}
