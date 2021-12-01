package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

import static com.kodilla.rps.Usage.printUsage;

public class RpsRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rps = {"1", "2", "3"};
        String name;
        int rounds;
        boolean end = false;
        String playerMove, computerMove;
        String answer;
        Random rand = new Random();

        System.out.print("Enter user name: ");
        name = scanner.nextLine();
        System.out.println("Up to how many wins you want to play?");
        rounds = scanner.nextInt();
//        System.out.println("Your name is: " + name);
//        System.out.println("Number of rounds: " + rounds);
        printUsage();

        while(!end) {
            System.out.println("What is your move?");
            answer = scanner.nextLine();
            if (answer.toLowerCase().equals("x")) end = true;
            if (answer.toLowerCase().equals("n")) end = false;
            playerMove = answer;
            computerMove = rps[rand.nextInt(rps.length)];

            System.out.println(name +"'s move is: " + playerMove);
            System.out.println("Computer's move is: " + computerMove);
//            if (playerMove == )
        }
    }
}
