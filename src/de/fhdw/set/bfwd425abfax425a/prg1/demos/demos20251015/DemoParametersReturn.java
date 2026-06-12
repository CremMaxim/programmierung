package de.fhdw.set.bfwd425abfax425a.prg1.demos.demos20251015;

public class DemoParametersReturn {

    public static void main(String[] args) {
        int a;

        a = 3784985;
        // greet("Guten Morgen!");
        // a = 34 * productTimesTwo(12, 3);
        // System.out.println(   a    );
        count(12, 16);

        if ( isOdd(a) ) {
            System.out.println("a ist ungerade");
        }
    }

    static boolean isOdd(int a) {
        return a % 2 == 1;
    }

    static void greet(String a) {
        System.out.println(a);
    }

    static int productTimesTwo(int a, int b) {
        int c;

        return 2 * a * b;
    }

    static void count(int a, int b) {
        int i;

        i = a;
        while (i<=b) {
            System.out.println(i);
            i += 1;       // i = i + 1; i++; ++i; i += 1
        }
    }

}
