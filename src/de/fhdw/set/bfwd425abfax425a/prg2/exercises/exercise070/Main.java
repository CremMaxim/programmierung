package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise070;

public class Main {

    public static void main(String[] args) {
        int result;
        for (int n=1; n<=20; n++) {
            result = Fibonacci.fib(n);
            System.out.printf("fib(%s)=%s\n", n, result);
        }
    }
}
