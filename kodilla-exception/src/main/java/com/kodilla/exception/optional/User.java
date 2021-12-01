package com.kodilla.exception.optional;

public class User {
    private String username;
    private int a;
    private int b;
    private String text;

    public User(String username, int a, int b, String text) {
        this.username = username;
        this.a = a;
        this.b = b;
        this.text = text;
    }

    public String getUsername() {
        return username;
    }
}
