package com.example.starhub.entity;

import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlaceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer place_id; // 포스트 id

    @Column(nullable = false)
    private String place;

    @Column(nullable = false)
    private float lat;

    @Column(nullable = false)
    private float lng;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private PostEntity post;



}
