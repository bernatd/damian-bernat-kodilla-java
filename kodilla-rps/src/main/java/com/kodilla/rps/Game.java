package com.kodilla.rps;

import java.util.Scanner;

import static com.kodilla.rps.Usage.printUsage;

public class Game {
    private boolean end;
    private Player player;
    private Computer computer;
    private final Scanner scanner;
    private int rounds;


    public Game() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        setup();

        while(!end) {
            String playerMove = player.move();
            if (playerMove.equalsIgnoreCase("x")) {
                end = true;
            } else if (playerMove.equalsIgnoreCase("n")) {
                System.out.println("New game");
                reset();
            } else if (playerMove.matches("[123]")) {
                String computerMove = computer.move();

                System.out.println(player.getName() + "'s move is: " + playerMove);
                System.out.println("Computer's move is: " + computerMove);

                checkResult(playerMove, computerMove);
                end = checkIfEnd();
            } else {
                System.out.println("Illegal move!");
                printUsage();
            }
        }
        scanner.close();
        System.out.println("Bye!");
    }

    private void setup() {
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();
        System.out.println("Up to how many wins you want to play?");
        String rnd = scanner.nextLine();
        while (!rnd.matches("^[1-9][0-9]?$|^100$")) {
            System.out.println("You need to select number from 1 to 100");
            rnd = scanner.nextLine();
        }
        rounds = Integer.parseInt(rnd);

        player = new Player(name);
        computer = new Computer();
        printUsage();
    }

    private void checkResult(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            System.out.println("It is a tie");
        } else {
            if (playerMove.equals("1") && computerMove.equals("2")) {
                System.out.println("Computer won!");
                computer.incrementNoOfWonRounds();
            } else if (playerMove.equals("1") && computerMove.equals("3")) {
                System.out.println(player.getName() + " won!");
                player.incrementNoOfWonRounds();
            } else if (playerMove.equals("2") && computerMove.equals("1")) {
                System.out.println(player.getName() + " won!");
                player.incrementNoOfWonRounds();
            } else if (playerMove.equals("2") && computerMove.equals("3")) {
                System.out.println("Computer won!");
                computer.incrementNoOfWonRounds();
            } else if (playerMove.equals("3") && computerMove.equals("1")) {
                System.out.println("Computer won!");
                computer.incrementNoOfWonRounds();
            } else if (playerMove.equals("3") && computerMove.equals("2")) {
                System.out.println(player.getName() + " won!");
                player.incrementNoOfWonRounds();
            }
        }
        System.out.println();
        System.out.print(player.getName() + " : " + player.getNoOfWonRounds());
        System.out.println("\t\t" + computer.getNoOfWonRounds() + " : " + "Computer");
    }

    private boolean checkIfEnd() {
        if ((player.getNoOfWonRounds() >= rounds) || (computer.getNoOfWonRounds() >= rounds)) {
            System.out.println("\nWould you like to play again? (press n for new game or x to quit)");
            String playerMove = player.move();
            while (!playerMove.matches("[nx]")) {
                System.out.println("Press n for new game or x to quit)");
                playerMove = player.move();
            }
            if (playerMove.equals("x"))  return true;
            if (playerMove.equals("n")) {
                System.out.println("\nNew game");
                reset();
                return false;
            }
        }
        return false;
    }

    private void reset() {
        player.setNoOfWonRounds(0);
        computer.setNoOfWonRounds(0);
    }
}
