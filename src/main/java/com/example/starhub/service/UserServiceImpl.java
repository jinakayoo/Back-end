package com.example.starhub.service;

import com.example.starhub.dto.user.UserRegisterDTO;
import com.example.starhub.entity.UserEntity;
import com.example.starhub.projection.user.GetUser;
import com.example.starhub.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
@RequiredArgsConstructor
@PropertySource("classpath:application.properties")
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Value("${upload.dir}")
    private String uploadDir;

    @Override
    public GetUser register(UserRegisterDTO userRegisterDTO, MultipartFile image) {

        try {
            byte[] imageBytes = image.getBytes();

            UserEntity user = UserEntity.builder()
                    .loginId(userRegisterDTO.getLoginId())
                    .password(userRegisterDTO.getPassword())
                    .name(userRegisterDTO.getName())
                    .age(userRegisterDTO.getAge())
                    .email(userRegisterDTO.getEmail())
                    .phoneNum(userRegisterDTO.getPhoneNum())
                    .introduction(userRegisterDTO.getIntroduction())
                    .imageData(imageBytes)
                    .build();

            UserEntity createUser = userRepository.save(user);
            return EntityToProjectionUser(createUser);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
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

