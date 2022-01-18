package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements Manufacturer, OrderService {
    @Override
    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = order(orderRequest.getSupplier(), orderRequest.getProduct());

        if (isOrdered) {
            return new OrderDto(orderRequest.getSupplier(),true);
        } else {
            return new OrderDto(orderRequest.getSupplier(),false);
        }
    }

    @Override
    public boolean order(Supplier supplier, Product product) {
        System.out.println("New order has been created.");
        System.out.println("Order details:");
        System.out.println("\tProduct: " + product.getProdName());
        System.out.println("\tBuyer: " + supplier.getName());
        System.out.println();
        return true;
    }
}
