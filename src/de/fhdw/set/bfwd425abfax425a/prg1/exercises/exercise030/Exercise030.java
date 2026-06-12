package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise030;

import java.util.Arrays;

public class Exercise030 {

    public static void main(String[] args) {
        long[] la = new long[] {1L, 2L, 3L, 4L, 5L};
        long[] result;

        System.out.println(Arrays.toString(la));
        rotateLeftA(la);
        System.out.println(Arrays.toString(la));

        result = rotateLeftB(la);
        System.out.println(Arrays.toString(la));
        System.out.println(Arrays.toString(result));
    }

    static void rotateLeftA(long[] la) {
        if (la.length >= 2) {
            long buffer;

            buffer = la[0];
            for (int i=1; i<la.length; i++) {
                la[i-1] = la[i];
            }
            la[la.length-1] = buffer;
        }
    }

    static long[] rotateLeftB(long[] la) {
        long[] result = new long[la.length];
        if (la.length >= 1) {
            result[result.length-1] = la[0];
            for (int i=1; i<la.length; i++) {
                result[i-1] = la[i];
            }
        }
        return result;
    }
}
