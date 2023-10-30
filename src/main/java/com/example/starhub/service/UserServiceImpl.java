package com.example.starhub.service;

import com.example.starhub.dto.user.UserRegisterDTO;
import com.example.starhub.entity.UserEntity;
import com.example.starhub.projection.user.GetUser;
import com.example.starhub.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public GetUser register(UserRegisterDTO userRegisterDTO) {
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
        return EntityToProjectionUser(createUser);
    }

    private GetUser EntityToProjectionUser(UserEntity user){
        GetUser userInfo = new GetUser() {
            @Override
            public String getLoginId() {
                return user.getLoginId();
            }

            @Override
            public String getName() {
                return user.getName();
            }

            @Override
            public Integer getAge() {
                return user.getAge();
            }

            @Override
            public String getEmail() {
                return user.getEmail();
            }

            @Override
            public String getPhoneNum() {
                return user.getPhoneNum();
            }

            @Override
            public String getIntroduction() {
                return user.getIntroduction();
            }
        };

        return userInfo;
    }

}

