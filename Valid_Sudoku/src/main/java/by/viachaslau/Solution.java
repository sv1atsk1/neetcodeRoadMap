package by.viachaslau;

import java.util.HashSet;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String>[] rows = new HashSet[9];
        HashSet<String>[] cols = new HashSet[9];
        HashSet<String>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char num = board[row][col];

                if (num != '.') {
                    String number = String.valueOf(num);
                    int boxIndex = (row / 3) * 3 + (col / 3);

                    if (rows[row].contains(number) || cols[col].contains(number) || boxes[boxIndex].contains(number)) {
                        return false;
                    }

                    rows[row].add(number);
                    cols[col].add(number);
                    boxes[boxIndex].add(number);
                }
            }
        }
        return true;
    }
}