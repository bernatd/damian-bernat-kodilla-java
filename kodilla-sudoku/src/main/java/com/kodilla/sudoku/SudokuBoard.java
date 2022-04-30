package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public final class SudokuBoard extends Prototype<SudokuBoard> {
    public static int BOARD_SIZE = 9;
    private String name;
    private List<SudokuRow> rowList = new ArrayList<>();

    public SudokuBoard(String name)
    {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<SudokuRow> getRowList() {
        return rowList;
    }

    public void insert(int col, int row, int value) {
        rowList.get(row).getSudokuElement().get(col).setValue(value);
    }

    public int getValue(int col, int row) {
        return rowList.get(row).getSudokuElement().get(col).getValue();
    }

    public List<Integer> getPossibleEntry(int col, int row) {
       return rowList.get(row).getSudokuElement().get(col).getPossibleEntries();
    }

    public void updatePossibleEntries(int col, int row, int value) {
        rowList.get(row).getSudokuElement().get(col).updatePossibleEntries(value);
    }

    public void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (i%3 == 0 && i != 0) System.out.println("------------------------");
            rowList.get(i).printRow();
            System.out.println();
        }
    }

    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard clonedSudokuBoard = super.clone();
        clonedSudokuBoard.rowList = new ArrayList<>();
        for (SudokuRow theRow : rowList) {
            SudokuRow clonedSudokuRow = new SudokuRow();
            for (SudokuElement theElement : theRow.getSudokuElement()) {
                clonedSudokuRow.getSudokuElement().add(theElement);
            }
            clonedSudokuBoard.getRowList().add(clonedSudokuRow);
        }
        return clonedSudokuBoard;
    }
}
