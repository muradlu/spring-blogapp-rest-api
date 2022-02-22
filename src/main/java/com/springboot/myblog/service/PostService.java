package com.springboot.myblog.service;

import com.springboot.myblog.payload.PostDto;
import com.springboot.myblog.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    PostResponse getAllPosts(int pageNo, int pageSize);
    PostDto getPostById(Long id);
    PostDto updatePost(PostDto postDto, Long id);
    void deletePost(Long id);
}
