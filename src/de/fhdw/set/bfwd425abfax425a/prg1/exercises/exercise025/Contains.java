package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise025;

public class Contains {

    static boolean contains(int[] intArray, int e) {
        boolean result;

        result = false;
        for (int current : intArray) {
            if (current == e) {
                result = true;
                break;
            }
        }
        return result;
    }

}
