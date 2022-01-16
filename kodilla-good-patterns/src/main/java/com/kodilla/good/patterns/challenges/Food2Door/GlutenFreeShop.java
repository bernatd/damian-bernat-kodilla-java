package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements Manufacturer {
    private int inventory;

    @Override
    public void process(OrderRequest orderRequest) {
        if (orderRequest.getSupplier() != null && orderRequest.getProduct() != null
                && orderRequest.getNoOfItems() != 0) {
            System.out.println("GlutenFreeShop: order created");
            this.inventory += orderRequest.getNoOfItems();
            System.out.println("Inventory: " + inventory);
        } else {
            System.out.println("GlutenFreeShop: order rejected.");
        }
    }
}
