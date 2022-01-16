package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRequest {
    private final Supplier supplier;
    private final Product product;
    private final int noOfItems;

    public OrderRequest(final Supplier supplier, final Product product, final int noOfItems) {
        this.supplier = supplier;
        this.product = product;
        this.noOfItems= noOfItems;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public int getNoOfItems() {
        return noOfItems;
    }
}
