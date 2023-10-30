package com.example.starhub.controller;

import com.example.starhub.dto.PostListResponseDto;
import com.example.starhub.dto.PostRequestDto;
import com.example.starhub.dto.PostResponseDto;
import com.example.starhub.entity.UserEntity;
import com.example.starhub.repository.UserRepository;
import com.example.starhub.service.PostService;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/post")
@RestController
public class PostController {
    private final PostService postService;

    private final UserRepository userRepository;

    public PostController(PostService postService, UserRepository userRepository){
        this.postService=postService;
        this.userRepository=userRepository;
    }
    @PostMapping("/create")
    public PostResponseDto createPost(UserEntity user, @RequestBody PostRequestDto requestDto){
        return postService.createPost(user, requestDto);
    }

    @GetMapping("/list")
    public List<PostListResponseDto> getAllPosts() {return postService.findAllPost();}

    @GetMapping("/detail")
    public PostResponseDto getOnePost(@PathVariable Long id){return postService.findOnePost(id);}

}
