package com.example.starhub.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private int userId;

    @Column(unique = true, nullable = false, length = 45)
    private String loginId;

    @Column(length=100, nullable = false)
    private String password;

    @Column(length=100, nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(length=100, nullable = false)
    private String email;

    @Column(length=100, nullable = false)
    private String phoneNum;

    @Column(length=20, nullable = false)
    private String introduction;

    @Lob
    @Column(name = "image_data")
    private byte[] imageData;
}
