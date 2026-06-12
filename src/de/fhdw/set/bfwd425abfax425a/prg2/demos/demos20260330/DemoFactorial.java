package de.fhdw.set.bfwd425abfax425a.prg2.demos.demos20260330;

public class DemoFactorial {

    static int factorial(int n) {
        int result;

        // assertion: n>=0
        if (n==0) {
            result = 1;
        }
        else {   // n>=1
            result = factorial(n-1) * n;
        }
        return result;
    }

    static int factorialWrong(int n) {
        int result;

        // assertion: n>=0
        result = factorialWrong(n-1) * n;
        return result;
    }
}
