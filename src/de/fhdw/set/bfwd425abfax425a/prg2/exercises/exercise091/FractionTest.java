package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise091;

import java.math.BigInteger;

public class FractionTest {

    public static void main(String[] args) {
        Fraction f1, f2, f3;

        f1 = new Fraction();
        f2 = new Fraction(new BigInteger("1"), new BigInteger("3"));
        f3 = new Fraction(2L, 5L);

        System.out.println(f1);
    }

}
