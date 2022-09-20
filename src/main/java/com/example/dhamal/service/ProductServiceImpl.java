package com.example.dhamal.service;

import com.example.dhamal.mapper.UserMapper;
import com.example.dhamal.model.User;
import com.example.dhamal.pojo.ProductListPojo;
import com.example.dhamal.pojo.UserDataProjection;
import com.example.dhamal.repository.UserRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final UserRepo userRepo;

    private final UserMapper mapper;
    private final ObjectMapper objectMapper;

    public ProductServiceImpl(UserRepo userRepo, UserMapper mapper, ObjectMapper objectMapper) {
        this.userRepo = userRepo;
        this.mapper = mapper;
        this.objectMapper = objectMapper;
    }

    @Override
    public ProductListPojo getProductById(Integer id) {
        return mapper.getSelectedData(id);
    }

    @Override
    public String getProduct(String name, Integer quantity) {
        return (name == null ? quantity.toString() : name);
    }

    @Override
    public List<User> getProductList() {
        List<User> userList = userRepo.getList();
//        List<ProductListPojo> productListPojos = objectMapper.convertValue(userList, new TypeReference<List<ProductListPojo>>() {
//        });
        return userList;
    }

    @Override
    public void saveData(User user) {
        userRepo.save(user);
    }

    @Override
    public Optional<User> findById(Integer id) {
        return userRepo.findById(id);
    }

    public Object getCRUDHere() {
        String username = "Ramesh";
        return userRepo.findUserByUsername(username);

    }
}


