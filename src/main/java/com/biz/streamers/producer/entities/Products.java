package com.biz.streamers.producer.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Products {

    @JsonProperty("products")
    private List<Product> products;

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public List<Product> getProducts() {
        return products;
    }
    @Override
    public String toString() {
        return "Products [products=" + products + "]";
    }

}
