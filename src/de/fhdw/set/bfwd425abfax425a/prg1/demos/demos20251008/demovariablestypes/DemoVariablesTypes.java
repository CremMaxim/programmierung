package de.fhdw.set.bfwd425abfax425a.prg1.demos.demos20251008.demovariablestypes;

public class DemoVariablesTypes {

    public static void main(String[] args) {
        int i, i2, i3;

        i = 0b11011;
        System.out.println(i);

        i2 = 0xABBA;
        System.out.println(i2);

        boolean b1, b2, b3;

        b1 = true;
        b2 = false;
        b3 = ! (b1 && b2 || true);
        System.out.println(b3);

        String s;

        s = "FHDW";
        System.out.println(s);

        byte by1, by2, by3;

        by1 = 120;
        by2 = 127;
        // by3 = by1 + by2;

        double d1, d2;

        d1 = 1e5;
        System.out.println(d1);
        d2 = 1e-2;
        System.out.println(d2);

        d2 = 1. / 3;
        System.out.println(d2);

        char c1, c2;

        c1 = 'a';
        c2 = 'b';
        System.out.print(c1);
        System.out.print('\n');
        System.out.println(c2);
        System.out.println('\u0433');

    }

}
