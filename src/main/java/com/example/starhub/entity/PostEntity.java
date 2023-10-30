package com.example.starhub.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer post_id; // 포스트 id

    @Column(nullable = false, length=20)
    private String skill;

    @Column(nullable = false, length=50)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(nullable = false, length=20)
    private String progress;

    @Column(nullable = false, length=10)
    private String people_num;

    @Column(nullable = false, length=20)
    private String deadline;

    @CreatedDate
    private LocalDateTime created_at;

    @Column(nullable = false, length=20)
    private String type;

    @Column
    private Boolean done;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private UserEntity user;

}