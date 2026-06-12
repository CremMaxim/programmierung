package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise087;

import java.math.BigInteger;

public class PowerRec {

    public static void main(String[] args) {
        System.out.println(power(BigInteger.TWO, BigInteger.TEN));
        System.out.println(power(BigInteger.TWO, BigInteger.valueOf(20L)));
    }

    static int power(int b, int n) {
        int result;

        if (n==0) {
            result = 1;
        }
        else {  // n > 0
            result = power(b, n-1) * b;
        }
        return result;
    }

    static BigInteger power(BigInteger b, BigInteger n) {
        BigInteger result;

        if (n.signum()==0) {
            result = BigInteger.ONE;
        }
        else {  // n > 0
            result = power(b, n.subtract(BigInteger.ONE)).multiply(b);
        }
        return result;
    }
}
