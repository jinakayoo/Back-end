package com.example.starhub.dto;

import com.example.starhub.entity.CommentEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class CommentRequestDto {

    private String content;

    private LocalDateTime createdAt;

    private boolean pick;

    private Integer postId;

    private Integer userId;




}
