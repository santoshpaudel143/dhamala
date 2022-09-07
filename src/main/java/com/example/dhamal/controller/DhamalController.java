package com.example.dhamal.controller;

import com.example.dhamal.pojo.Product;
import com.example.dhamal.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class DhamalController {

    @Autowired
    private final ProductService productService;

    public DhamalController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("get")
    public String returnData() {
        return "Hello World";
    }

    @GetMapping("getById/{id}")
    public Product getProductById(@PathVariable Integer id) {

        return productService.getProductById(id);
    }

    @GetMapping("getProduct")
    public String getProduct(@RequestParam(name = "name", required = false) String name,
                              @RequestParam(name = "quantity", required = false, defaultValue = "12") Integer quantity){
        return productService.getProduct(name, quantity);
    }
}