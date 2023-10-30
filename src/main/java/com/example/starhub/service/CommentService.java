package com.example.starhub.service;

import com.example.starhub.dto.CommentRequestDto;
import com.example.starhub.dto.CommentResponseDto;
import com.example.starhub.entity.CommentEntity;
import com.example.starhub.entity.PostEntity;
import com.example.starhub.entity.UserEntity;
import com.example.starhub.repository.CommentRepository;
import com.example.starhub.repository.PostRepository;
import com.example.starhub.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    @Transactional
    public CommentResponseDto createComment(UserEntity user, Integer id,CommentRequestDto requestDto){
        PostEntity post = postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("조회 실패"));
        CommentEntity comment = new CommentEntity(user, post, requestDto);
        commentRepository.save(comment);
        CommentResponseDto commentResponseDto = new CommentResponseDto(comment);
        return commentResponseDto;
    }


    // 전체 댓글 조회
    @Transactional
    public List<CommentResponseDto> readAllComments(Integer id) {
        return commentRepository.findAllByBoardId(id);
    }
}
