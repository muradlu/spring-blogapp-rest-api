package com.springboot.myblog.payload;

import lombok.Data;

@Data
public class PostDto {
    private Long id;
    private String title;
    private String content;
    private String description;
}
