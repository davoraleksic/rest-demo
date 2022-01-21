package com.example.restdemo.service;

import com.example.restdemo.dto.UserRequestDto;
import com.example.restdemo.dto.UserResponseDto;

import java.util.List;

public interface UserService {
    List<UserResponseDto> findAll();
    UserResponseDto create(UserRequestDto dto);
}
