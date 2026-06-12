package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise029;

import java.util.Arrays;

public class Exercise029 {

    public static void main(String[] args) {
        testSameElements();
    }

    static void testSameElements() {
        int[] arrayA;
        int[] arrayB;
        boolean result, expectedResult;

        arrayA = new int[] {1, 2, 3, 1, 2, 3};
        arrayB = new int[] {2, 3, 1, 2, 1, 3};
        expectedResult = true;
        result = sameElements(arrayA, arrayB);
        if (result != expectedResult) {
            System.out.println("Falsches Ergebnis!");
            System.out.println(Arrays.toString(arrayA));
            System.out.println(Arrays.toString(arrayB));
        }

        arrayA = new int[] {1, 2, 3, 1, 2, 3};
        arrayB = new int[] {2, 3, 1, 2, 1, 3, 1};
        expectedResult = false;
        result = sameElements(arrayA, arrayB);
        if (result != expectedResult) {
            System.out.println("Falsches Ergebnis!");
            System.out.println(Arrays.toString(arrayA));
            System.out.println(Arrays.toString(arrayB));
        }

        arrayA = new int[] {1, 2, 3, 1, 2, 3, 3};
        arrayB = new int[] {2, 3, 1, 2, 1, 3};
        expectedResult = false;
        result = sameElements(arrayA, arrayB);
        if (result != expectedResult) {
            System.out.println("Falsches Ergebnis!");
            System.out.println(Arrays.toString(arrayA));
            System.out.println(Arrays.toString(arrayB));
        }

        arrayA = new int[] {1, 2, 3};
        arrayB = new int[] {2, 1, 2};
        expectedResult = false;
        result = sameElements(arrayA, arrayB);
        if (result != expectedResult) {
            System.out.println("Falsches Ergebnis!");
            System.out.println(Arrays.toString(arrayA));
            System.out.println(Arrays.toString(arrayB));
        }

    }

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

    static boolean sameElements(int[] arrayA, int[] arrayB) {
        boolean result;
        int numA, numB;

        if (arrayA.length!=arrayB.length) {
            result = false;
        }
        else {
            result = true;
            for (int elementArrayA : arrayA) {
                numA = getFrequencyOfElementInArray(elementArrayA, arrayA);
                numB = getFrequencyOfElementInArray(elementArrayA, arrayB);
                if (numA != numB) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

}
