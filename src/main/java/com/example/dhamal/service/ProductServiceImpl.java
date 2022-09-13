package com.example.dhamal.service;

import com.example.dhamal.pojo.Product;
import com.example.dhamal.pojo.ProductListPojo;
import com.example.dhamal.pojo.UserDataPojo;
import com.example.dhamal.repository.UserRepo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private final UserRepo userRepo;
    private final ObjectMapper objectMapper;

    public ProductServiceImpl(UserRepo userRepo, ObjectMapper objectMapper) {
        this.userRepo = userRepo;
        this.objectMapper = objectMapper;
    }

    @Override
    public UserDataPojo getProductById(Integer id) {
        Map<String, Object> selectedData = userRepo.getSelectedData(id);
        return objectMapper.convertValue(selectedData, UserDataPojo.class);
    }

    @Override
    public String getProduct(String name, Integer quantity) {
        return (name == null ? quantity.toString() : name);
    }

    @Override
    public List<ProductListPojo> getProductList() {
        List<Map<String, Object>> userList = userRepo.getList();
        List<ProductListPojo> productListPojos = objectMapper.convertValue(userList, new TypeReference<List<ProductListPojo>>() {
        });
        return productListPojos;
    }

    public Object getCRUDHere() {
        String username = "Ramesh";
        return userRepo.findUserByUsername(username);

    }
}


