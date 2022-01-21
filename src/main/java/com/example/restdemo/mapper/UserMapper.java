package com.example.restdemo.mapper;

import com.example.restdemo.dto.UserRequestDto;
import com.example.restdemo.dto.UserResponseDto;
import com.example.restdemo.entity.User;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(builder = @Builder(disableBuilder = true))
public interface UserMapper {
    UserResponseDto toDto(User entity);
    User toEntity(UserRequestDto dto);
}
