package com.springboot.myblog.controller;

import com.springboot.myblog.payload.PostDto;
import com.springboot.myblog.repository.PostRepository;
import com.springboot.myblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts/api")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
        return new ResponseEntity<>(postService.createPost(postDto), HttpStatus.CREATED);
    }

    @GetMapping
    public List<PostDto> getAllPosts(){
        return postService.getAllPosts();
    }

    @PutMapping("/{id}")
    public ResponseEntity<PostDto> updatePost(@PathVariable("id") Long id, @RequestBody PostDto postDto){
        return new ResponseEntity<>(postService.updatePost(postDto, id), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable("id") Long id){
        return new ResponseEntity<>(postService.getPostById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable("id") Long id){
        postService.deletePost(id);
        return new ResponseEntity<>("Post removed", HttpStatus.OK);
    }
}
