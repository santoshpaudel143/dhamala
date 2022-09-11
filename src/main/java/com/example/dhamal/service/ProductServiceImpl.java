package com.example.dhamal.service;

import com.example.dhamal.pojo.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {


    @Override
    public Product getProductById(Integer id) {
        Product product = new Product();
        product.setId(1);
        product.setProductName("Mouse");
        product.setPrice(500.0);

        return product;
    }

    @Override
    public String getProduct(String name, Integer quantity) {
        return (name == null ? quantity.toString() : name);
    }
}