package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    public static int ROW_SIZE = 9;

    private final List<SudokuElement> elementList = new ArrayList<>();

    public List<SudokuElement> getSudokuElement() {
        return elementList;
    }

    public void printRow() {
        for (int i = 0; i < ROW_SIZE; i++) {
            if (i%3 == 0 && i != 0) System.out.print(" | ");
            System.out.print(elementList.get(i) + " ");
        }
    }
}
