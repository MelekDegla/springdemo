package com.example.demo.services;

import com.example.demo.entities.Post;
import com.example.demo.repositories.PostRepository;
import javafx.geometry.Pos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post save (Post post){
        return postRepository.save(post);
    }

    public List<Post> findAll(){
        return postRepository.findAll();
    }
}
