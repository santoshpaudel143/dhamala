package com.example.dhamal.service.impl;

import com.example.dhamal.mapper.UserDetailMapper;
import com.example.dhamal.model.StudentDetails;
import com.example.dhamal.model.User;
import com.example.dhamal.pojo.UserDetailRequestPojo;
import com.example.dhamal.pojo.UserDetailResponsePojo;
import com.example.dhamal.repository.StudentDetailsRepo;
import com.example.dhamal.repository.UserRepo;
import com.example.dhamal.service.UserService;
import com.example.dhamal.utill.GenericFileHandler;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final UserDetailMapper userDetailMapper;
    private final ObjectMapper objectMapper;
    private final StudentDetailsRepo studentDetailsRepo;


    @Override
    public Object getUserById(Integer id) {
        return userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found by given id"));

    }

    @Override
    public Object getUserByName(String name) {
        UserDetailResponsePojo userDetailResponsePojo = userDetailMapper.getUserDetailByName(name);
        return userDetailResponsePojo;
    }

    @Override
    public void saveUserDetails(UserDetailRequestPojo userDetailRequestPojo) throws Exception {
        String imagePath = GenericFileHandler.saveImage(userDetailRequestPojo.getUserImage(), "/file/image/user/");
        StudentDetails studentDetails = studentDetailsRepo.findById(userDetailRequestPojo.getStudentDetailId()).orElseThrow(() -> new RuntimeException("Student Detail Id Not Exist."));
        User user = User
                .builder()
                .name(userDetailRequestPojo.getName())
                .surName(userDetailRequestPojo.getSurName())
                .address(userDetailRequestPojo.getAddress())
                .email(userDetailRequestPojo.getEmail())
                .studentDetails(studentDetails)
                .imagePath(imagePath)
                .build();
        userRepo.save(user);
    }
}

/**
 * This comment is written in new-branch
 */