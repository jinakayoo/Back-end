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

    private int post_id;

    private String user;

//    public CommentRequestDto(CommentEntity comment){
//        this.content=comment.getContent();
//        this.createdAt=comment.getCreatedAt();
//        this.pick=comment.isPick();
//        this.post_id=comment.getPost().getId();
//        this.user=comment.getUser().getName();
//    }


}
