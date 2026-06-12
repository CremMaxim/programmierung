package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise070;

public class Fibonacci {

    static int fib(int n) {
        int result;
        // System.out.printf("fib(%s) wurde aufgerufen!\n", n);  // visualize calls
        if (n==1 || n==2) {
            result = 1;
        }
        else {
            result = fib(n-2) + fib(n-1);
        }
        return result;
    }

}
