package de.fhdw.set.bfwd425abfax425a.prg2.demos.demos20260528;

public class DemoExceptions8 {

    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 5 - a;

        try {
            a = a / b;
        } catch (ArithmeticException e) {
            throw new DivisionByZeroException(a);
        }
    }

}
