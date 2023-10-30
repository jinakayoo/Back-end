package com.example.starhub.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String content;

    @CreatedDate
    private LocalDateTime createdAt;

    @Column
    private boolean pick;

//    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//    @JsonIgnore
//    @JoinColumn(name = "boardId")
//    private PostEntity post;


//    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//    @JsonIgnore
//    @JoinColumn(name = "boardId")
//    private Board board;

}
