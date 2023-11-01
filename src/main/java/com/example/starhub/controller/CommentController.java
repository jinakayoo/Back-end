//package com.example.starhub.controller;
//
//import com.example.starhub.dto.CommentRequestDto;
//import com.example.starhub.dto.CommentResponseDto;
//import com.example.starhub.entity.PostEntity;
//import com.example.starhub.entity.UserEntity;
//import com.example.starhub.repository.PostRepository;
//import com.example.starhub.repository.UserRepository;
//import com.example.starhub.service.CommentService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//
//@RestController
//@RequestMapping("/api/comment")
//public class CommentController {
//    private final CommentService commentService;
//    private final UserRepository userRepository;
//    private final PostRepository postRepository;
//
//    public CommentController(CommentService commentService, UserRepository userRepository, PostRepository postRepository) {
//        this.commentService = commentService;
//        this.userRepository = userRepository;
//        this.postRepository=postRepository;
//    }
//
////    @PostMapping("/create")
////    public CommentResponseDto createBoard(UserEntity user, @RequestParam("post_id") PostEntity post_id,@RequestBody CommentRequestDto requestDto) {
////        return commentService.createComment(user, post_id,requestDto);
////    }
//
//    // 댓글 목록 조회
//    @GetMapping("/list")
//    public List<CommentResponseDto> getAllComments(@PathVariable Integer id) {
//        return commentService.readAllComments(id);
//    }
//}
