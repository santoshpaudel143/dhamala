package com.example.dhamal.service;

import com.example.dhamal.pojo.Product;

public interface ProductService {

    Product getProductById(Integer id);


    String getProduct(String name, Integer quantity);
}
