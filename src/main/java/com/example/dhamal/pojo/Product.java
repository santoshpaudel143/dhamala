package com.example.dhamal.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
    Integer id;
    @JsonProperty("product_name")
    String productName;
    Double price;
    int quantity;

    public Product(Integer id, String productName, Double price, int quantity) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
