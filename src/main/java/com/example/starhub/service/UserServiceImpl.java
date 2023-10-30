package com.example.starhub.service;

import com.example.starhub.dto.user.UserRegisterDTO;
import com.example.starhub.entity.UserEntity;
import com.example.starhub.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public UserEntity register(UserRegisterDTO userRegisterDTO) {
        UserEntity user = UserEntity.builder()
                .loginId(userRegisterDTO.getLoginId())
                .password(userRegisterDTO.getPassword())
                .name(userRegisterDTO.getName())
                .age(userRegisterDTO.getAge())
                .email(userRegisterDTO.getEmail())
                .phoneNum(userRegisterDTO.getPhoneNum())
                .introduction(userRegisterDTO.getIntroduction())
                .build();

        UserEntity createUser = userRepository.save(user);
        return createUser;
    }
}

