package com.example.starhub.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId; // 댓글 Id

    @Column(nullable = false)
    private String content;

    @CreatedDate
    private LocalDateTime createdAt;

    @Column
    private boolean pick;


    @ManyToOne(cascade = CascadeType.REMOVE)
    private UserEntity user;


    @ManyToOne(cascade = CascadeType.REMOVE)
    private PostEntity post;

}
