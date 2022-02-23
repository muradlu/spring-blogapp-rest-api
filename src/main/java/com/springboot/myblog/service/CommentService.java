package com.springboot.myblog.service;

import com.springboot.myblog.payload.CommentDto;

public interface CommentService {
    CommentDto createComment(Long postId, CommentDto commentDto);
}
