package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Supplier supplier = new Supplier("John Doe");
        Product product = new Product("Aqq");
        int noOfItems = 10;

        return new OrderRequest(supplier, product, noOfItems);
    }
}
