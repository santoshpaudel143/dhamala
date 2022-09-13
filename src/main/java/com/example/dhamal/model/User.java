package com.example.dhamal.model;

import com.example.dhamal.enums.UserType;

import javax.persistence.*;

@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = "name", name = "UNIQUE_user_name")})
public class User {

    @Id
    private Integer Id;

    @Column(name = "name")
    private String name;
    private String surName;
    private String email;
    private String address;

    @Enumerated(EnumType.STRING)
    private UserType userType;
}
