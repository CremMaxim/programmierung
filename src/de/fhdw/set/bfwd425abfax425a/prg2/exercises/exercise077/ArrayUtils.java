package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise077;

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

    static String centerAlign(int i, int size) {
        String s;
        int l;
        int nBlanksLeft, nBlanksRight;

        s = String.valueOf(i);
        l = s.length();
        if ( l > size) {
            s = s.substring(size);
        }
        else {
            nBlanksLeft = (size-l)/2;
            nBlanksRight = nBlanksLeft;
            if ((size-l)%2==1) {
                nBlanksRight++;
            }
            s = repeat(nBlanksLeft, " ") + s + repeat(nBlanksRight, " ");
        }
        return s;
    }

    static int getMaxSize(int[][] a) {
        int result;

        result = 0;
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                if (String.valueOf(a[i][j]).length()>result) {
                    result = String.valueOf(a[i][j]).length();
                }
            }
        }
        return result;
    }
    static void print2DArray(int[][] a) {
        int maxColumnSize;
        maxColumnSize = getMaxSize(a);
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                System.out.print(rightAlign(a[i][j], maxColumnSize) + " ");
            }
            System.out.println();
        }
    }

    static void printPascalsTriangleNicely(int[][] array) {
        int maxLength;
        double indent;
        int fieldLength;
        int numberOfRows;

        maxLength = getMaxSize(array);
        if (maxLength % 2 == 1) {
            fieldLength = maxLength;
        }
        else {
            fieldLength = maxLength + 1;
        }
        numberOfRows = array.length;
        for (int i=0; i<numberOfRows; i++) {
            indent = (numberOfRows-i) * 0.5 * (fieldLength+1);
            System.out.print(repeat((int) indent, " "));
            for (int j=0; j<array[i].length; j++) {
                System.out.print(centerAlign(array[i][j], fieldLength) + " ");
            }
            System.out.println();
        }
    }

}
