package com.kodilla.sudoku;

import java.util.*;

public class SudokuElement {
    public static int EMPTY = -1;
    private int value;
    private final List<Integer> possibleEntries = new ArrayList<>();

    public SudokuElement() {
        this.value = EMPTY;
        for (int i = 0; i < 9; i++) {
            this.possibleEntries.add(i + 1);
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Integer> getPossibleEntries() {
        return possibleEntries;
    }

    public void updatePossibleEntries(int value) {
            possibleEntries.remove((Integer) value);
    }

    public void showPossibleEntries() {
        System.out.println(possibleEntries);
    }

    @Override
    public String toString() {
        if (value == -1)
        {
            return " ";
        } else {
            return String.valueOf(value);
        }
    }
}
