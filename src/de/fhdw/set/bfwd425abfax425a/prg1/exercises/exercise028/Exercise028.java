package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise028;

public class Exercise028 {

    static int getFrequencyOfElementInArray(int e, int[] ia) {
        int result;

        result = 0;
        for (int current : ia) {
            if (current==e) {
                result++;
            }
        }
        return result;
    }

}
