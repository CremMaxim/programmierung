package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise026;

public class MiniSort {

    static void miniSort(int[] intArr) {
        if (intArr[0] > intArr[1]) {
            swap(intArr, 0, 1);
        }
        if (intArr[1] > intArr[2]) {
            swap(intArr, 1, 2);
        }
        if (intArr[0] > intArr[1]) {
            swap(intArr, 0, 1);
        }
    }

    static void swap(int[] intArr, int pos1, int pos2) {
        int help;

        help = intArr[pos1];
        intArr[pos1] = intArr[pos2];
        intArr[pos2] = help;
    }

}
