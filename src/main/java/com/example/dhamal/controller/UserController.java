package com.example.dhamal.controller;

import com.example.dhamal.pojo.ApiResponse;
import com.example.dhamal.pojo.UserDetailRequestPojo;
import com.example.dhamal.service.UserService;
import com.example.dhamal.utill.GenericFileHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping("user/")
@RequiredArgsConstructor
public class UserController extends ApiResponse {

    private final UserService userService;

    @GetMapping("getUser/{id}")
    public ApiResponse getUserById(@PathVariable(name = "id") Integer id) {
        return success("User data fetched successufly", userService.getUserById(id));
    }

    @GetMapping("getUserByName")
    public ApiResponse getUserByName(@RequestParam(name = "name", required = false, defaultValue = "0") String name) {
        return success("User Date Fetched Successfully", userService.getUserByName(name));
    }

    @PostMapping("save")
    public ApiResponse saveUserDetails(@ModelAttribute @Valid UserDetailRequestPojo userDetailRequestPojo) throws Exception {
        userService.saveUserDetails(userDetailRequestPojo);
        return success("User details saved successfully", null);
    }
    @GetMapping("image")
    public void getUserImage(@RequestParam("filePath") String filePath, HttpServletResponse response) throws Exception {
        GenericFileHandler.getImage(filePath, response);
    }
}
