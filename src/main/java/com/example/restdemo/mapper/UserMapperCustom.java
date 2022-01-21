package com.example.restdemo.mapper;

import com.example.restdemo.dto.UserResponseDto;
import com.example.restdemo.entity.User;

public class UserMapperCustom {
    // ovakav način ne koristiš
//    public static UserResponseDto toDto(User user) {
//        if (user == null)
//            return null;
//
//        return new UserResponseDto(
//                user.getFirstName(),
//                user.getLastName()
//        );
//    }
}
