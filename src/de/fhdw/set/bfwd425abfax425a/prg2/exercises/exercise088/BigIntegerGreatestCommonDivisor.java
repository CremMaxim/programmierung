package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise088;

import java.math.BigInteger;

public class BigIntegerGreatestCommonDivisor {

    static BigInteger gcd(BigInteger a, BigInteger b) {
        BigInteger result;

        if (a.signum()==-1) {
            a = a.negate();
        }
        if (b.signum()==-1) {
            b = b.negate();
        }
        // a>=0, b>=0
        if (b.compareTo(a)<0) {
            BigInteger help;
            help = a;
            a = b;
            b = help;
        }
        // 0<=a<=b  (a>=0, b>=0, b>=a)
        if (a.signum()==0) {
            result = b;
        }
        else {  // 1<=a<=b
            if (a.equals(BigInteger.ONE)) {
                result = BigInteger.ONE;
            }
            else {   // 2<=a<=b; we know: b mod a < b
                result = gcd(a, b.mod(a));
            }
        }
        return result;
    }

}
