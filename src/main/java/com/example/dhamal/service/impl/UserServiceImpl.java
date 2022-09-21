package com.example.dhamal.service.impl;

import com.example.dhamal.mapper.UserDetailMapper;
import com.example.dhamal.model.User;
import com.example.dhamal.pojo.ApiResponse;
import com.example.dhamal.pojo.UserDetailRequestPojo;
import com.example.dhamal.pojo.UserDetailResponsePojo;
import com.example.dhamal.projection.UserDetailProjection;
import com.example.dhamal.repository.UserRepo;
import com.example.dhamal.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final UserDetailMapper userDetailMapper;
    private final ObjectMapper objectMapper;


    @Override
    public ApiResponse getUserById(Integer id) {
        User byId = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found by given id"));
        return null;
    }

    @Override
    public Object getUserByName(String name) {
        UserDetailProjection userDetailResponsePojo = userRepo.getUserByName(name);
        return userDetailResponsePojo;
    }

    @Override
    public void saveUserDetails(UserDetailRequestPojo userDetailRequestPojo) {
        User user = null;
        if (userDetailRequestPojo.getId() != null)
            user = userRepo.findById(userDetailRequestPojo.getId()).orElse(new User());
        user = objectMapper.convertValue(userDetailRequestPojo, User.class);
        userRepo.save(user);
    }
}

/**
 * This comment is written in new-branch
 */