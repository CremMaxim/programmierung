package de.fhdw.set.bfwd425abfax425a.prg2.demos.demos20260330;

public class DemoGreatestCommonDivisor {

    static int gcd(int a, int b) {
        int result;

        if (a<0) {
            a = -a;
        }
        if (b<0) {
            b = -b;
        }
        // a>=0, b>=0
        if (b<a) {
            int help;
            help = a;
            a = b;
            b = help;
        }
        // 0<=a<=b  (a>=0, b>=0, b>=a)
        if (a==0) {
            result = b;
        }
        else {  // 1<=a<=b
            if (a==1) {
                result = 1;
            }
            else {   // 2<=a<=b; we know: b mod a < b
                result = gcd(a, b % a);
            }
        }
        return result;
    }

}
