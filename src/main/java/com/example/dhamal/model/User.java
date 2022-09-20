package com.example.dhamal.model;

import com.example.dhamal.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = "name", name = "UNIQUE_user_name")})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @SequenceGenerator(sequenceName = "users_seq_gen",name="users_seq",allocationSize = 1)
    @GeneratedValue(generator = "users_seq_gen",strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "name")
    private String name;
    private String surName;
    private String email;
    private String address;

    @Enumerated(EnumType.STRING)
    private UserType userType;
}
