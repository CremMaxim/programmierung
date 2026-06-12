package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise069;

public class Main {

    public static void main(String[] args) {
        int result;
        for (int n=1; n<=5; n++) {
            result = SumEvenNaturalNumbers.nThEvenNaturalNumbersSum(n);
            System.out.printf("%s: %s\n", n, result);
        }
    }

}
