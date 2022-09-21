package com.example.dhamal.service;

import com.example.dhamal.pojo.ApiResponse;
import com.example.dhamal.pojo.UserDetailResponsePojo;

public interface UserService {
    ApiResponse getUserById(Integer id);

    UserDetailResponsePojo getUserByName(String name);
}
