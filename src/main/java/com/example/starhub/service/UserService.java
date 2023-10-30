package com.example.starhub.service;

import com.example.starhub.dto.user.UserRegisterDTO;
import com.example.starhub.entity.UserEntity;
import com.example.starhub.projection.user.GetUser;

public interface UserService {

    GetUser register(UserRegisterDTO userRegisterDTO);

}
