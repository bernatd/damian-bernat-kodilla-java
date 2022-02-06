package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGame {
    Scanner sc;
    SudokuBoard sb;
    String answer = "";

    public SudokuGame() {
        sc = new Scanner(System.in);
        sb = new SudokuBoard();
    }

    boolean resolveSudoku() {
        System.out.println("Fill the board by giving: column, row, value");
        System.out.println("or type SUDOKU to solve the game");
        System.out.println();
        System.out.print("[column, row, value]> ");
        answer = sc.nextLine();
        while(!answer.equalsIgnoreCase("SUDOKU")) {
            if (!answer.matches("^[1-9],[1-9],[1-9]")) {
                System.out.println("You need to provide column, row, value e.g. 2,1,9");
            } else {
                String[] line = answer.split(",");
                int col, row, value;
                col = Integer.parseInt(line[0]);
                row = Integer.parseInt(line[1]);
                value = Integer.parseInt(line[2]);
                sb.insert(col - 1, row - 1, value);
                sb.printBoard();
            }
            System.out.print("[column, row, value]> ");
            answer = sc.nextLine();
        }

        //solve sudoku
        System.out.println("Sudoku solved.");


        System.out.println("Would you like to resolve another sudoku game? [y/n]");
        answer = sc.nextLine();
        while(!answer.matches("[yn]")) {
            System.out.println("Type y to resolve current game or n to quit.");
            answer = sc.nextLine();
        }
        return !answer.equalsIgnoreCase("y");
    }
}
