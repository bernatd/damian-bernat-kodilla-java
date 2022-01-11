package com.kodilla.good.patterns.challenges.ProductOrderService;

public class Product {
    private final String prodName;

    public Product(String prodName) {
        this.prodName = prodName;
    }

    public String getProdName() {
        return prodName;
    }
}
