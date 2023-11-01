//package com.example.starhub.dto;
//
//import com.example.starhub.entity.CommentEntity;
//
//import java.time.LocalDateTime;
//
//public class CommentResponseDto {
//    private int post_id;
//    private String content;
//
//    private LocalDateTime createdAt;
//    private String user;
//
//    private boolean pick;
//
//
//    public CommentResponseDto(CommentEntity comment){
//        this.content=comment.getContent();
//        this.createdAt=comment.getCreatedAt();
//        this.pick=comment.isPick();
//        //this.post_id=comment.getPost().getId();
//        this.user=comment.getUser().getName();
//    }
//}
