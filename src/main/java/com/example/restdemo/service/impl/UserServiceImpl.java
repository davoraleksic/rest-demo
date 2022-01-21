package com.example.restdemo.service.impl;

import com.example.restdemo.dto.UserRequestDto;
import com.example.restdemo.dto.UserResponseDto;
import com.example.restdemo.entity.User;
import com.example.restdemo.mapper.UserMapper;
import com.example.restdemo.mapper.UserMapperCustom;
import com.example.restdemo.repository.UserRepository;
import com.example.restdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public List<UserResponseDto> findAll() {
        return userRepository.findAll().stream().map(userMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public UserResponseDto create(UserRequestDto dto) {
        User user = userMapper.toEntity(dto);
        User savedUser = userRepository.save(user);
        return userMapper.toDto(savedUser);
    }
}
