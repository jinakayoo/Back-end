package com.example.starhub.service;

import com.example.starhub.dto.PostListResponseDto;
import com.example.starhub.dto.PostRequestDto;
import com.example.starhub.dto.PostResponseDto;
import com.example.starhub.entity.PostEntity;
import com.example.starhub.entity.UserEntity;
import com.example.starhub.repository.PostRepository;
import com.example.starhub.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PostService {
    private final UserRepository userRepository;
    private final PostRepository postRepository;


    public PostResponseDto createPost(UserEntity user, PostRequestDto requestDto){
        PostEntity post=new PostEntity(user, requestDto);
        postRepository.save(post);
        return new PostResponseDto(post);
    }

    public List<PostListResponseDto> findAllPost(){
        return postRepository.findAllByOrderByCreatedAtDesc();
    }

    // 글 하나 가져오기
    public PostResponseDto findOnePost(Integer id) {
        PostEntity post = postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("게시글이 없습니다")
        );
        return new PostResponseDto(post);
    }
}
