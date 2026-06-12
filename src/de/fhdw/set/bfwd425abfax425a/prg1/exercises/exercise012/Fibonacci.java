package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise012;

public class Fibonacci {

    public static void main(String[] args) {
        int a, b, i, old_a;

        a = 0;
        b = 1;
        i = 1;
        while (i<=20) {
            System.out.println(b);
            old_a = a;
            a = b;
            b = old_a + b;
            i = i + 1;
        }
    }
}
