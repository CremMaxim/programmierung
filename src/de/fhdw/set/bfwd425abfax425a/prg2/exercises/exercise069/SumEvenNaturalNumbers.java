package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise069;

public class SumEvenNaturalNumbers {

    static int nThEvenNaturalNumbersSum(int n) {
        int result;
        if (n==1) {
            result = 2;
        }
        else {   // n >= 2
            result = nThEvenNaturalNumbersSum(n-1) + 2 * n;
        }
        return result;
    }

}
