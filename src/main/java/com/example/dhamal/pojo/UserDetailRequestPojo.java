package com.example.dhamal.pojo;

import com.example.dhamal.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailRequestPojo {

    private Integer id;
    private String name;
    private String surName;
    private String email;
    private String address;
    private UserType userType;
}