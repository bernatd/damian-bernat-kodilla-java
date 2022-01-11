package com.kodilla.good.patterns.challenges.ProductOrderService;

public interface OrderRepository {
    boolean createOrder(User user, Product product);
}
