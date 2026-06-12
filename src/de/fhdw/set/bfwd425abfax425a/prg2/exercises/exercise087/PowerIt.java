package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise087;

import java.math.BigInteger;

public class PowerIt {

    public static void main(String[] args) {
        System.out.println(power(BigInteger.TWO, BigInteger.TEN));
        System.out.println(power(BigInteger.TWO, BigInteger.valueOf(20L)));
    }

    static int power(int b, int n) {
        int result;

        result = 1;
        for (int i=1; i<=n; i++) {
            result *= b;
        }
        return result;
    }

    static BigInteger power(BigInteger b, BigInteger n) {
        BigInteger result;

        result = BigInteger.ONE;
        for (BigInteger i=BigInteger.ONE;
             i.compareTo(n)<=0;
             i=i.add(BigInteger.ONE)) {
            result = result.multiply(b);
        }
        return result;
    }
}
