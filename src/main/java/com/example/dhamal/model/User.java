package com.example.dhamal.model;

import com.example.dhamal.enums.UserType;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    private Integer Id;
    private String name;
    private String email;
    private String address;

    @Enumerated(EnumType.STRING)
    private UserType userType;
}
