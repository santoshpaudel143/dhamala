package com.example.dhamal.pojo;


import com.example.dhamal.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductListPojo {
    private Integer id;
    private String name;
    private String email;
    private String address;
    private UserType userType;
}
