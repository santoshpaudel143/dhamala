package com.example.dhamal.service;

import com.example.dhamal.model.User;
import com.example.dhamal.pojo.ProductListPojo;
import com.example.dhamal.pojo.UserDataProjection;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    ProductListPojo getProductById(Integer id);


    String getProduct(String name, Integer quantity);

    List<User> getProductList();

    void saveData(User user);

    Optional<User> findById(Integer id);
}
