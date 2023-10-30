package com.example.starhub.service;

import com.example.starhub.dto.user.UserRegisterDTO;
import com.example.starhub.entity.UserEntity;

public interface UserService {

    UserEntity register(UserRegisterDTO userRegisterDTO);

}
