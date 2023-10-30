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

    private String people_num;

    private String deadline;

    private String type;

    private String title;

    public PostListResponseDto(PostEntity post) {
        this.skill=post.getSkill();
        this.place=post.getPlace();
        this.progress=post.getProgress();
        this.people_num=post.getPeople_num();
        this.deadline=post.getDeadline();
        this.type=post.getType();
        this.title = post.getTitle();
    }

}