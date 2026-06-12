package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise026;

import java.util.Arrays;

public class TestMiniSort {

    public static void main(String[] args) {
        int[] testArray;

        testArray = new int[] {1, 2, 3};
        System.out.println(Arrays.toString(testArray));
        MiniSort.miniSort(testArray);
        System.out.println(Arrays.toString(testArray));
        System.out.println();

        testArray = new int[] {1, 3, 2};
        System.out.println(Arrays.toString(testArray));
        MiniSort.miniSort(testArray);
        System.out.println(Arrays.toString(testArray));
        System.out.println();

        testArray = new int[] {2, 1, 3};
        System.out.println(Arrays.toString(testArray));
        MiniSort.miniSort(testArray);
        System.out.println(Arrays.toString(testArray));
        System.out.println();

        testArray = new int[] {2, 3, 1};
        System.out.println(Arrays.toString(testArray));
        MiniSort.miniSort(testArray);
        System.out.println(Arrays.toString(testArray));
        System.out.println();

        testArray = new int[] {3, 1, 2};
        System.out.println(Arrays.toString(testArray));
        MiniSort.miniSort(testArray);
        System.out.println(Arrays.toString(testArray));
        System.out.println();

        testArray = new int[] {3, 2, 1};
        System.out.println(Arrays.toString(testArray));
        MiniSort.miniSort(testArray);
        System.out.println(Arrays.toString(testArray));
        System.out.println();

        testArray = new int[] {1, 2, 1};
        System.out.println(Arrays.toString(testArray));
        MiniSort.miniSort(testArray);
        System.out.println(Arrays.toString(testArray));
        System.out.println();
    }
}
