package com.kodilla.good.patterns.challenges.ProductOrderService;

public class User {
    private final String name;
    private final String lastName;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name + " " + lastName;
    }
}
