package com.kodilla.sudoku;

public class SudokuSolver {

    private static boolean isNumberInRow(SudokuBoard sb, int row, int number) {
        for (int i = 0; i < 9; i++) {
            if (sb.getValue(i, row) == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInColumn(SudokuBoard sb, int column, int number) {
        for (int i = 0; i < 9; i++) {
            if (sb.getValue(column, i) == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInBox(SudokuBoard sb, int row, int column, int number) {
        int localBoxRow = row - row % 3;
        int localBoxColumn = column - column % 3;
        for (int i = localBoxRow; i < localBoxRow + 3; i++) {
            for (int j = localBoxColumn; j < localBoxColumn + 3; j++) {
                if (sb.getValue(j,i) == number) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValidPlacement(SudokuBoard sb, int row, int column, int number) {
        return !isNumberInRow(sb, row, number) &&
                !isNumberInColumn(sb, column, number) &&
                !isNumberInBox(sb, row, column, number);
    }

    public static boolean solve(SudokuBoard sb) {
/*        SudokuBoard backtrack = null;
        try {
            backtrack = sb.deepCopy();
            backtrack.setName("backtrack");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }*/

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sb.getValue(i,j) == -1) {
                    for (int k = 0; k < sb.getPossibleEntry(i,j).size(); k++) {
                        int value = sb.getPossibleEntry(i,j).get(k);
                        if (isValidPlacement(sb, j, i, value)) {
                            sb.insert(i,j,value);
                        } else {
                            if (sb.getPossibleEntry(i,j).size() == 1) return false;
                            //TODO: dodać backtracking
                            sb.updatePossibleEntries(i, j, value);
                        }

                    }
                }
            }
        }
        return true;
    }

}
