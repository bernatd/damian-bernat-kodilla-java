package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcessor {
    private Manufacturer manufacturer;

    public OrderProcessor(final Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        return manufacturer.process(orderRequest);
    }
}
