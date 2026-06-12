package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise031;

import java.util.Arrays;

public class TestExercise031 {

    public static void main(String[] args) {
        testRemoveElementFromArray();
    }

    static void testRemoveElementFromArray() {
        int[] array;
        int element;
        int[] result, expectedResult;

        array = new int[] {1, 2, 3, 1, 2, 3};
        element = 3;
        expectedResult = new int[] {1, 2, 1, 2, 3};
        result = Exercise031.removeElementFromArray(element, array);
        if ( ! arraysAreEqual(expectedResult, result) ) {
            System.out.println("Falsches Ergebnis!");
            System.out.println(Arrays.toString(expectedResult));
            System.out.println(Arrays.toString(result));
        }

        array = new int[] {1, 2, 3, 1, 2, 3};
        element = 4;
        expectedResult = new int[] {1, 2, 3, 1, 2, 3};
        result = Exercise031.removeElementFromArray(element, array);
        if ( ! arraysAreEqual(expectedResult, result) ) {
            System.out.println("Falsches Ergebnis!");
            System.out.println(Arrays.toString(expectedResult));
            System.out.println(Arrays.toString(result));
        }
    }

    private static boolean arraysAreEqual(int[] array1, int[] array2) {
        boolean result;

        result = true;
        if (array1.length != array2.length) {
            result = false;
        }
        else {
            for (int i=0; i<array1.length; i++) {
                if (array1[i]!=array2[i]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

}
