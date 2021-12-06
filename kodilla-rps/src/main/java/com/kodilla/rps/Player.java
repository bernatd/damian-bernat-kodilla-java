package com.kodilla.rps;

import java.util.Scanner;

public class Player {
    private final String name;
    private final Scanner scanner;
    private int noOfWonRounds = 0;

    public Player(String name) {
        this.name = name;
        scanner = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public int getNoOfWonRounds() {
        return noOfWonRounds;
    }

    public void incrementNoOfWonRounds() {
       noOfWonRounds++;
    }

    public void setNoOfWonRounds(int noOfWonRounds) {
        this.noOfWonRounds = noOfWonRounds;
    }

    public String move() {
        System.out.print("\nWhat is your move?  ");
        return scanner.nextLine();
    }
}
