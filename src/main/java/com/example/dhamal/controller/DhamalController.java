package com.example.dhamal.controller;

import com.example.dhamal.pojo.Product;
import com.example.dhamal.pojo.ProductListPojo;
import com.example.dhamal.pojo.UserDataPojo;
import com.example.dhamal.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class DhamalController {

    private final ProductService productService;

    public DhamalController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("get")
    public String returnData() {
        return "Hello World";
    }

    @GetMapping("getById/{id}")
    public UserDataPojo getProductById(@PathVariable Integer id) {
        return productService.getProductById(id);
    }

    @GetMapping("getProduct")
    public Object getProduct(@RequestParam(name = "name", required = false) String name,
                             @RequestParam(name = "quantity", required = false, defaultValue = "12") Integer quantity) {
         productService.getProduct(name, quantity);
         return productService.getProductList();
    }

    @GetMapping("getAllUsers")
    public List<ProductListPojo> getAllUser() {
        return productService.getProductList();
    }
}