package com.kodilla.rps;

import java.util.Scanner;

public class Player {
    private final  String name;
    private int noOfWonRounds = 0;
    private final Scanner scanner;

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
        System.out.println("\nWhat is your move?");
        return scanner.nextLine();
    }
}
