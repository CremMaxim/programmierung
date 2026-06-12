package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise077;

public class PascalsTriangle {

    static int binom(int row, int col) {
        int result;

        // System.out.printf("binom(%s,%s)\n", row, col);
        if (col==0 || row==col) {
            result = 1;
        }
        else {
            result = binom(row-1, col-1) + binom(row-1, col);
        }
        return result;
    }

    static int binom(int row, int col, int[][] pasTri) {
        int result;

        // System.out.printf("binom(%s,%s)\n", row, col);
        if (col==0 || row==col) {
            result = 1;
        }
        else {
            result = pasTri[row-1][col-1] + pasTri[row-1][col];
        }
        return result;
    }

    static int[][] pascalsTriangle(int n) {
        int[][] result;

        result = new int[n][];
        for (int row=0; row<n; row++) {
            result[row] = new int[row+1];
            for (int col=0; col<=row; col++) {
                // result[row][col] = binom(row, col);
                result[row][col] = binom(row, col, result);
            }
        }
        return result;
    }

}
