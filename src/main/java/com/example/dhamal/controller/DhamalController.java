package com.example.dhamal.controller;

import com.example.dhamal.model.User;
import com.example.dhamal.pojo.ApiResponse;
import com.example.dhamal.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public class DhamalController extends ApiResponse {

    private final ProductService productService;

    public DhamalController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("get")
    public String returnData() {
        return "Hello World";
    }

    @PostMapping("save")
    public ApiResponse saveData(@RequestBody User user) {
        // check if the given id exists
        if (user.getId() != null) {
            // check if the given id exists
            if (!productService.findById(user.getId()).isPresent()) {
                return error("Given user does no exist. So you can't update!!", null);
            }
        }

        productService.saveData(user);
        return success("Data has been successfully saved", null);
    }

    @GetMapping("getById/{id}")
    public ApiResponse getProductById(@PathVariable Integer id) {
        throw new RuntimeException("This is handled by global exception");
//        return success("User data of given id " + id + "has been fetched", productService.getProductById(id));
    }

    @GetMapping("getProduct")
    public Object getProduct(@RequestParam(name = "name", required = false) String name,
                             @RequestParam(name = "quantity", required = false, defaultValue = "12") Integer quantity) {
        productService.getProduct(name, quantity);
        return productService.getProductList();
    }

    @GetMapping("getAllUsers")
    public ApiResponse getAllUser() {
        return success("User data has been retrieved", productService.getProductList());
    }
}