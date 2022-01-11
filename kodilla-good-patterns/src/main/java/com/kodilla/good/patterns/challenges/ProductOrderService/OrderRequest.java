package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderRequest {
    private final User user;
    private final Product product;

    public OrderRequest(final User user, final Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }
}
