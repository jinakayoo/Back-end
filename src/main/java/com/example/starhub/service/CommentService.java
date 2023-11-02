package com.example.starhub.service;

import com.example.starhub.dto.comment.CommentRequestDto;
import com.example.starhub.dto.comment.CommentResponseDto;
import java.util.List;

public interface CommentService {


    CommentResponseDto createComment(CommentRequestDto requestDto);

    List<CommentResponseDto> readAllComments(Integer id);
}
