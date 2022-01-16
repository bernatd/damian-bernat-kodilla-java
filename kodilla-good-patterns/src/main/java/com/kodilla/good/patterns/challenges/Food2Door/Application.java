package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        GlutenFreeShop gfs = new GlutenFreeShop();
        ExtraFoodShop efs = new ExtraFoodShop();
        HealthyShop hs = new HealthyShop();

        gfs.process(orderRequest);
        efs.process(orderRequest);
        hs.process(orderRequest);
    }
}
