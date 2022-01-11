package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("John", "Doe");
        Product product = new Product("Laczki meskie");

        return new OrderRequest(user, product);
    }
}
