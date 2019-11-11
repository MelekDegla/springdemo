package com.example.demo.controller;

import com.example.demo.entities.Post;
import com.example.demo.services.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/posts")
    public Post save(@RequestBody Post post){
        return this.postService.save(post);
    }

    @GetMapping("/posts")
    public List<Post> findAll(){
        return this.postService.findAll();
    }
}
