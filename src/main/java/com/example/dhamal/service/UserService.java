package com.example.dhamal.service;

import com.example.dhamal.pojo.ApiResponse;
import com.example.dhamal.pojo.UserDetailResponsePojo;
import com.example.dhamal.projection.UserDetailProjection;

public interface UserService {
    ApiResponse getUserById(Integer id);

    UserDetailResponsePojo getUserByName(String name);
}
