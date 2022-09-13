package com.example.dhamal.service;

import com.example.dhamal.pojo.Product;
import com.example.dhamal.pojo.ProductListPojo;
import com.example.dhamal.pojo.UserDataPojo;

import java.util.List;

public interface ProductService {

    UserDataPojo getProductById(Integer id);


    String getProduct(String name, Integer quantity);

    List<ProductListPojo> getProductList();
}
