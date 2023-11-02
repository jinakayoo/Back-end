package com.example.starhub.projection.comment;

import lombok.Setter;

import java.time.LocalDateTime;

public interface GetCommentList {

    Integer getId();

    String getContent();

    LocalDateTime getCreatedAt();

    UserEntity getUser();

    interface UserEntity{
        String getName();
    }
}
