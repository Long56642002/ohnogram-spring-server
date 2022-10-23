package com.example.serverspring.controller;

import com.example.serverspring.model.Post;
import com.example.serverspring.service.iService.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/post")
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<Map<String, Object>> createNewPost(@RequestBody Post post) {
        String message = "create post successfully!";
        try {
            this.postService.createPost(post);
        }
        catch (Exception e) {
            message = e.getMessage();
        }
        finally {
            Map<String, Object> response = Map.of(
                    "data",Map.of(
                            "message",message
                    )
            );
            return ResponseEntity.ok().body(response);
        }
    }

    @GetMapping
    public ResponseEntity<Map<String, Object>> getAllPosts() {
        String message = "successfully";
        Iterable<Post> posts = null;
        try {
            posts = this.postService.getPosts();
        }catch (Exception e) {
            message = e.toString();
        }finally {
            Map<String, Object> response = Map.of(
                    "data",Map.ofEntries(
                            Map.entry("message",message),
                            Map.entry("data",posts)
                    )
            );
            return ResponseEntity.ok().body(response);
        }
    }

    @DeleteMapping
    public ResponseEntity<Map<String, Object>> deletePost(String id) {
        String message = "delete successfully";
        try {
            this.postService.deletePost(id);
        }catch (Exception e) {
            message = e.getMessage();
        }finally {
            Map<String, Object> response = Map.of(
                    "data",Map.of(
                            "message",message
                    )
            );
            return ResponseEntity.ok().body(response);
        }
    }

}