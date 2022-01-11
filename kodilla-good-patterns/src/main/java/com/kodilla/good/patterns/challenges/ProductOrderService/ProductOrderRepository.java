package com.kodilla.good.patterns.challenges.ProductOrderService;

public class ProductOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(User user, Product product) {
        System.out.println("Order information has been stored in repository.");
        return true;
    }
}
