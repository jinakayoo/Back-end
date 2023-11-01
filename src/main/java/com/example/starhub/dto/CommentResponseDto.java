package com.example.starhub.dto;

import com.example.starhub.entity.CommentEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CommentResponseDto {
    private Integer postId;
    private String content;

    private LocalDateTime createdAt;
    private String userName;

    private boolean pick;


    public CommentResponseDto(CommentEntity comment){
        this.content=comment.getContent();
        this.createdAt=comment.getCreatedAt();
        this.pick=comment.isPick();
        this.postId=comment.getPost().getPostId();
        this.userName=comment.getUser().getName();
    }
}
