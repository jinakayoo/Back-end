package com.example.starhub.entity;

import com.example.starhub.dto.PostRequestDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.apache.catalina.User;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id; // 포스트 id

    @Column(nullable = false, length=20)
    private String skill;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(nullable = false, length=50)
    private String place;

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

    @Column(nullable = false, length=20)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL) // 또는 CascadeType.PERSIST 설정 가능
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @JsonIgnore
    @OneToMany(mappedBy = "post")
    List<CommentEntity> comments = new ArrayList<>();

    public PostEntity(UserEntity user, PostRequestDto requestDto) {
        this.skill=requestDto.getSkill();
        this.place=requestDto.getPlace();
        this.progress=requestDto.getProgress();
        this.people_num=requestDto.getPeople_num();
        this.deadline=requestDto.getDeadline();
        this.type=requestDto.getType();
        this.done=requestDto.getDone();
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
        this.user=user;
    }

}