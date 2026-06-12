package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise074;

public class Demo2DArrays {

    public static void main(String[] args) {
        int[][] a, b;

        a = new int[20][43];

        System.out.println(a[0][2]);
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[0].length; j++) {
                a[i][j] = i*j;
            }
        }

        b = new int[2][];
        b[0] = new int[3];
        b[1] = new int[2];
        for (int i=0; i<b.length; i++) {
            for (int j=0; j<b[i].length; j++) {
                b[i][j] = i*j;
            }
        }

        int[] c = new int[] {1,2,3,4};
        int[][] d = new int[][] {{1,2},{1,2,3},{1,2,3,4,5}};
    }
}
