package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise031;



public class Exercise031 {

    static int[] removeElementFromArray(int e, int[] ia) {
        int[] result;

        if (contains(ia, e)) {
            // delete first occurrence of e from ia
            result = copyArrayWithoutFirstOccurrenceOfElement(e, ia);
        }
        else {
            // no element has to be deleted
            result = copyArray(ia);
        }
        return result;
    }

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

    private static int[] copyArray(int[] ia) {
        int[] result;

        result = new int[ia.length];
        for (int i=0; i<ia.length; i++) {
            result[i] = ia[i];
        }
        return result;
    }

    private static int[] copyArrayWithoutFirstOccurrenceOfElement(int e, int[] ia) {
        int[] result;
        int indexIa, indexResult;
        boolean isFirstOccurrence;

        isFirstOccurrence = true;
        result = new int[ia.length-1];
        indexResult = 0;
        indexIa = 0;
        while (indexIa<ia.length) {
            if (ia[indexIa] == e && isFirstOccurrence) {
                indexIa++;
                isFirstOccurrence = false;
            }
            else {
                result[indexResult] = ia[indexIa];
                indexResult++;
                indexIa++;
            }
        }
        return result;
    }

}
