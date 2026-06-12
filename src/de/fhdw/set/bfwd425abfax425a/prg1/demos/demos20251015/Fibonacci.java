package de.fhdw.set.bfwd425abfax425a.prg1.demos.demos20251015;

public class Fibonacci {

    public static void main(String[] args) {
        fibonacci(20);
    }

    static void fibonacci(int n) {
        int a, b, i, old_a;

        a = 0;
        b = 1;
        i = 1;
        while (i<=n) {
            System.out.println(b);
            old_a = a;
            a = b;
            b = old_a + b;
            i = i + 1;
        }
    }
}
