package com.kodilla.good.patterns.challenges.ProductOrderService;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(User user, Product product) {
        System.out.println("New order has been created.");
        System.out.println("Order details:");
        System.out.println("\tProduct: " + product.getProdName());
        System.out.println("\tBuyer: " + user.getName());
        System.out.println();
        return true;
    }
}
