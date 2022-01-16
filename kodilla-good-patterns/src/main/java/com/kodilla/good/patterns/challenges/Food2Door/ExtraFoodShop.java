package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Random;

public class ExtraFoodShop implements Manufacturer {
    @Override
    public void process(final OrderRequest orderRequest) {
        if (orderRequest.getSupplier() != null && orderRequest.getProduct() != null
                && orderRequest.getNoOfItems() != 0) {
            System.out.println("ExtraFoodShop: order created");
            Random rand = new Random();
            int orderConfirmationNumber = rand.nextInt(1000) + 2;
            System.out.println("Order confirmation number is: " + orderConfirmationNumber);
        } else {
            System.out.println("ExtraFoodShop: order rejected.");
        }
    }
}
