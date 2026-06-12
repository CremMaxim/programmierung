package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise086;

import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        BigInteger result, result2;

        for (BigInteger i=BigInteger.valueOf(1L);
             i.compareTo(BigInteger.valueOf(10L))<=0;
             i=i.add(BigInteger.ONE)) {
            result = factorialRec(i);
            result2 = factorial(i);
            System.out.printf("%s -> %s | %s\n", i, result, result2);
        }
    }

    static int factorial(int n) {
        int result;

        result = 1;
        for (int i=2; i<=n; i++) {
            result = result * i;
        }
        return result;
    }

    static BigInteger factorial(BigInteger n) {
        BigInteger result;

        result = BigInteger.ONE;
        for (BigInteger i=BigInteger.valueOf(2L); i.compareTo(n)<=0; i=i.add(BigInteger.ONE)) {
            result = result.multiply(i);
        }
        return result;
    }

    static int factorialRec(int n) {
        int result;

        if (n<=1) {
            result = 1;
        }
        else {
            result = factorialRec(n-1) * n;
        }
        return result;
    }

    static BigInteger factorialRec(BigInteger n) {
        BigInteger result;

        if (n.compareTo(BigInteger.ONE)<=0) {
            result = BigInteger.ONE;
        }
        else {
            result = factorialRec(n.subtract(BigInteger.ONE)).
                    multiply(n);
        }
        return result;
    }

}
