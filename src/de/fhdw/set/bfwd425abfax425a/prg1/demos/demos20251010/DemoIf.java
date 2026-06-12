package de.fhdw.set.bfwd425abfax425a.prg1.demos.demos20251010;

public class DemoIf {

    public static void main(String[] args) {
        boolean b1, b2;

        b1 = true;
        b2 = false;
        if (b1 && ! (b2 || true)) {
            System.out.println("then Block");
        }
        else {
            System.out.println("else Block");
        }
    }
}
