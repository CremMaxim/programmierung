package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise032;

public class Mirror {

    static void swap(int[] intArr, int pos1, int pos2) {
        int help;

        help = intArr[pos1];
        intArr[pos1] = intArr[pos2];
        intArr[pos2] = help;
    }

    static void mirrorA(int[] ia) {
        for (int i=0; i<ia.length/2; i++) {
            swap(ia, i, ia.length-i-1);
        }
    }

    static int[] mirrorB(int[] ia) {
        int[] result;

        result = new int[ia.length];
        for (int i=0; i<ia.length; i++) {
            result[ia.length-i-1] = ia[i];
        }
        return result;
    }

    static void mirrorC(int[] ia, int[] result) {
        for (int i=0; i<ia.length; i++) {
            result[ia.length-i-1] = ia[i];
        }
    }

}
