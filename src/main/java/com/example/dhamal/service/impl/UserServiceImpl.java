package com.example.dhamal.service.impl;

import com.example.dhamal.mapper.UserDetailMapper;
import com.example.dhamal.model.User;
import com.example.dhamal.pojo.ApiResponse;
import com.example.dhamal.pojo.UserDetailResponsePojo;
import com.example.dhamal.repository.UserRepo;
import com.example.dhamal.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final UserDetailMapper userDetailMapper;


    @Override
    public ApiResponse getUserById(Integer id) {
        User byId = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found by given id"));
        return null;
    }

    @Override
    public UserDetailResponsePojo getUserByName(String name) {
        UserDetailResponsePojo userDetailResponsePojo = userDetailMapper.getUserDetailByName(name);
        return userDetailResponsePojo;
    }
}
