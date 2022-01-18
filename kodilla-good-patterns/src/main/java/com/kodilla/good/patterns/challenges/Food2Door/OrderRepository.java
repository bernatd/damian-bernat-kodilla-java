package com.kodilla.good.patterns.challenges.Food2Door;

public interface OrderRepository {
    boolean createOrder(Supplier supplier, Product product);
}
