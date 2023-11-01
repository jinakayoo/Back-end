package com.example.starhub.repository;

import com.example.starhub.dto.CommentResponseDto;
import com.example.starhub.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<CommentEntity, Integer> {
    List<CommentResponseDto> findAllByPostPostId(Integer postId);


}
