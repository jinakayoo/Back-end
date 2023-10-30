package com.example.starhub.dto;

import com.example.starhub.entity.PostEntity;
import com.example.starhub.entity.UserEntity;

import java.time.LocalDateTime;

public class PostResponseDto {
    private String skill;

    private String place;

    private String progress;

    private String people_num;

    private String deadline;


    private String type;

    private Boolean done;

    private String title;

    private String content;

    private LocalDateTime created_at;

    private String user;

    public PostResponseDto(UserEntity user, PostEntity post) {
        this.skill=post.getSkill();
        this.place=post.getPlace();
        this.progress=post.getProgress();
        this.people_num=post.getPeople_num();
        this.deadline=post.getDeadline();
        this.type=post.getType();
        this.done=post.getDone();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.created_at = post.getCreated_at();
        this.user=user.getName();
    }
}
