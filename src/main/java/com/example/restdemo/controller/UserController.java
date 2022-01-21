package com.example.restdemo.controller;

import com.example.restdemo.dto.UserRequestDto;
import com.example.restdemo.dto.UserResponseDto;
import com.example.restdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<UserResponseDto>> getAllUsers(){
        return ResponseEntity.ok(userService.findAll());
    }

    @PostMapping
    public ResponseEntity<UserResponseDto> create(@RequestBody UserRequestDto userRequestDto){
        return ResponseEntity.ok(userService.create(userRequestDto));
    }

}
