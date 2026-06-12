package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise075;

public class ArrayUtils {

    static String repeat(int n, String s) {
        String result;
        result = "";
        for (int i=1; i<=n; i++) {
            result += s;
        }
        return result;
    }

    static String rightAlign(int i, int size) {
        String result;
        if (size < String.valueOf(i).length()) {
            result = String.valueOf(i);
        }
        else {
            result = repeat(size - String.valueOf(i).length(), " ") + i;
        }
        return result;
    }

    static int getMaxColumnSize(int[][] a) {
        int result;

        result = 0;
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                if (String.valueOf(a[i][j]).length()>result) {
                    result = String.valueOf(a[i][j]).length();
                }
            }
            System.out.println();
        }
        return result;
    }
    static void print2DArray(int[][] a) {
        int maxColumnSize;
        maxColumnSize = getMaxColumnSize(a);
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                System.out.print(rightAlign(a[i][j], maxColumnSize) + " ");
            }
            System.out.println();
        }
    }

}
