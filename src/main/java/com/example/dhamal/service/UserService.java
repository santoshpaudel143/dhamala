package com.example.dhamal.service;

import com.example.dhamal.pojo.ApiResponse;
import com.example.dhamal.pojo.UserDetailRequestPojo;
import com.example.dhamal.pojo.UserDetailResponsePojo;

public interface UserService {
    Object getUserById(Integer id);

    Object getUserByName(String name);

    void saveUserDetails(UserDetailRequestPojo userDetailRequestPojo) throws Exception;
}
