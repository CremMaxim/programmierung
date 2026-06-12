package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise024;

public class Sum {

    static double sum(double[] array) {
        double result;

        result = 0.0;
        for (double currentValue : array) {
            result += currentValue;
        }
        return result;
    }

}
