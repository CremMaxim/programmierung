package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise046.exercise46e;

public class Product {

    static int product(int n) {
        int result;

        result = 1;
        for (int factor=2; factor<=n; factor++) {
            result *= factor;
        }
        return result;
    }

}
