package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    public static int BOARD_SIZE = 9;
    private final List<SudokuRow> sudokuBoard;

    public SudokuBoard()
    {
        this.sudokuBoard = new ArrayList<>();
        for (int i = 0; i < BOARD_SIZE; i++) {
            this.sudokuBoard.add(new SudokuRow());
        }
    }

    public void insert(int col, int row, int value) {
        sudokuBoard.get(row).getSudokuRow().get(col).setValue(value);
    }

    public void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (i%3 == 0 && i != 0) System.out.println("------------------------");
            sudokuBoard.get(i).printRow();
            System.out.println();
        }
    }
}
