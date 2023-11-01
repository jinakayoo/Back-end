package com.example.starhub.dto;

import com.example.starhub.entity.PostEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PostListResponseDto {
    private String skill;

    private String place;

    private String progress;

    private String peopleNum;

    private String deadline;

    private String type;

    private String title;

    private LocalDateTime createdAt;

    private String userName;

    public PostListResponseDto(PostEntity post) {
        this.skill=post.getSkill();
        this.place=post.getPlace();
        this.progress=post.getProgress();
        this.peopleNum=post.getPeopleNum();
        this.deadline=post.getDeadline();
        this.type=post.getType();
        this.createdAt=post.getCreatedAt();
        this.title = post.getTitle();
    }

}