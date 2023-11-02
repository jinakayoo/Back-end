package com.example.starhub.service;

import com.example.starhub.dto.comment.CommentRequestDto;
import com.example.starhub.dto.comment.CommentResponseDto;
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
public class CommentServiceImpl implements CommentService{
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    //@Transactional
    public CommentResponseDto createComment(CommentRequestDto requestDto){
        Integer userId = requestDto.getUserId();
        UserEntity user = userRepository.findById(userId).orElseThrow(
                () -> new IllegalArgumentException("사용자 조회 실패"));
        Integer postId = requestDto.getPostId();
        PostEntity post = postRepository.findById(postId).orElseThrow(
                () -> new IllegalArgumentException("포스트 조회 실패"));
        CommentEntity comment = new CommentEntity(user, post, requestDto);
        commentRepository.save(comment);
        //CommentResponseDto commentResponseDto = new CommentResponseDto(comment);
        return new CommentResponseDto(comment);
    }


    // 전체 댓글 조회
    @Transactional
    public List<CommentResponseDto> readAllComments(Integer id) {
        return commentRepository.findAllByPostPostId(id);
    }
}
