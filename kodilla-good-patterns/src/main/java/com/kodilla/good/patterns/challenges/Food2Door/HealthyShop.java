package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements Manufacturer {
    @Override
    public void process(OrderRequest orderRequest) {
        if (orderRequest.getSupplier() != null && orderRequest.getProduct() != null
                && orderRequest.getNoOfItems() != 0) {
            System.out.println("HealthyShop: order created");
        } else {
            System.out.println("HealthyShop: order rejected.");
        }
    }
}
