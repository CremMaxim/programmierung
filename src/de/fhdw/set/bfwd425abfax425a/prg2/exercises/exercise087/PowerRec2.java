package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise087;

import java.math.BigInteger;

public class PowerRec2 {

    public static void main(String[] args) {
        System.out.println(power(BigInteger.TWO, BigInteger.TEN));
        System.out.println(power(BigInteger.TWO, BigInteger.valueOf(20L)));
    }

    static int power(int b, int n) {
        int result;
        int help;

        if (n==0) {
            result = 1;
        }
        else {  // n > 0
            if (n%2==0) {  // n is even
                help = power(b, n/2);
                result = help * help;
            }
            else {   // n is odd
                help = power(b, (n-1)/2);
                result = help * help * b;
            }
        }
        return result;
    }

    static BigInteger power(BigInteger b, BigInteger n) {
        BigInteger result;
        BigInteger help;

        if (n.signum()==0) {
            result = BigInteger.ONE;
        }
        else {  // n > 0
            if (n.mod(BigInteger.TWO).signum()==0) {  // n is even
                help = power(b, n.divide(BigInteger.TWO));
                result = help.multiply(help);
            }
            else {   // n is odd
                help = power(b,
                  (n.subtract(BigInteger.ONE)).divide(BigInteger.TWO));
                result = help.multiply(help).multiply(b);
            }
        }
        return result;
    }
}
