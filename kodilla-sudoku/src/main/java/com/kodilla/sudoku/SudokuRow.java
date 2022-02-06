package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    public static int ROW_SIZE = 9;
    private final List<SudokuElement> sudokuRow;

    public SudokuRow()
    {
        this.sudokuRow = new ArrayList<>();
        for (int i = 0; i < ROW_SIZE; i++) {
            this.sudokuRow.add(new SudokuElement());
        }
    }

    public List<SudokuElement> getSudokuRow() {
        return sudokuRow;
    }

    public void printRow() {
        for (int i = 0; i < ROW_SIZE; i++) {
            if (i%3 == 0 && i != 0) System.out.print(" | ");
            System.out.print(sudokuRow.get(i) + " ");
        }
    }
}
