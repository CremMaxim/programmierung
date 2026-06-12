package de.fhdw.set.bfwd425abfax425a.prg1.demos.demos20251017;

public class DemoIntArray {

    public static void main(String[] args) {
        int[] a;

        a = new int[3];

        a[0] = 17;
        a[1] = 18;
        a[2] = 19;
        System.out.println(a[1]);

        testArray(a);
        System.out.println(a[1]);
    }

    static void testArray(int[] p) {
        p[1] = 20;
    }

}
