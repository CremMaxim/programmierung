package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise032;

import java.util.Arrays;

public class TestMirror {

    public static void main(String[] args) {
        int[] ia = new int[] {1, 2, 3, 4, 5, 6};
        int[] result;

        System.out.println(Arrays.toString(ia));
        Mirror.mirrorA(ia);
        System.out.println(Arrays.toString(ia));

        System.out.println(Arrays.toString(ia));
        result = Mirror.mirrorB(ia);
        System.out.println(Arrays.toString(ia));
        System.out.println(Arrays.toString(result));

        int[] result2 = new int[ia.length];
        Mirror.mirrorC(ia, result2);
        System.out.println(Arrays.toString(ia));
        System.out.println(Arrays.toString(result2));
    }
}
