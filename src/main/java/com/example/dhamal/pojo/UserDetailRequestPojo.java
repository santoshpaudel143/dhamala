package com.example.dhamal.pojo;

import com.example.dhamal.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailRequestPojo {

    private Integer id;
    @NotNull(message = "User name cannot be null")
    @NotBlank(message = "User name cannot be blank")
    @Size(min = 5, max = 15, message = "Name cannot be less than 5 or greater than 15")
    private String name;
    private String surName;
    private String email;
    private String address;
    private UserType userType;
    private Long studentDetailId;
    private MultipartFile userImage;

}