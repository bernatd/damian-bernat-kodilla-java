package com.kodilla.rps;

import java.util.Random;

public class Computer extends Player {
    private final String[] rps = {"1", "2", "3"};
    Random rand = new Random();

    public Computer() {
        super("Computer");
    }

    @Override
    public String move() {
        return rps[rand.nextInt(rps.length)];
    }

}
