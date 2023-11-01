package com.example.starhub.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class PostRequestDto {

    private String skill;

    private String place;

    private String progress;

    private String peopleNum;

    private String deadline;

    private String type;

    private Boolean done;

    private String title;

    private String content;

//    private LocalDateTime createdAt;
//
    private Integer userId;
}