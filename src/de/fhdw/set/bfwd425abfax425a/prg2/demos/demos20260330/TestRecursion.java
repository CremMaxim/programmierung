package de.fhdw.set.bfwd425abfax425a.prg2.demos.demos20260330;

import java.util.Arrays;

public class TestRecursion {

    public static void main(String[] args) {
        testBinarySearch();
    }

    static void testFactorial() {
        for (int i=0; i<=10; i++) {
            // System.out.println(i + " " + DemoFactorial.factorial(i));
            System.out.printf("%s! = %s\n", i, DemoFactorial.factorial(i));
        }
    }

    static void testFactorialWrong() {
        DemoFactorial.factorialWrong(5);
    }

    static void testGreatestCommonDivisor() {
        int result;
        for (int a=-4; a<=4; a++) {
            for (int b=-4; b<=4; b++) {
                result = DemoGreatestCommonDivisor.gcd(a, b);
                // System.out.printf("a=%s b=%s result=%s\n", a, b, result);
                System.out.printf("gcd(%s,%s)=%s\n", a, b, result);
            }
        }
    }

    static void testArraySum() {
        int[] a;
        int result;

        a = new int[] {1,2,3};
        result = DemoArraySum.sum(a);
        System.out.printf("%s %s\n", Arrays.toString(a), result);

        a = new int[0];
        result = DemoArraySum.sum(a);
        System.out.printf("%s %s\n", Arrays.toString(a), result);

        a = new int[] {1000};
        result = DemoArraySum.sum(a);
        System.out.printf("%s %s\n", Arrays.toString(a), result);
    }

    static void testMirrorString() {
        String s;
        String result;

        s = "FHDW";
        result = DemoMirrorString.mirrorString(s);
        System.out.printf("%s %s\n", s, result);

        s = "";
        result = DemoMirrorString.mirrorString(s);
        System.out.printf("%s %s\n", s, result);

        s = "F";
        result = DemoMirrorString.mirrorString(s);
        System.out.printf("%s %s\n", s, result);

        s = "FH";
        result = DemoMirrorString.mirrorString(s);
        System.out.printf("%s %s\n", s, result);
    }

    static void testTowersOfHanoi() {
        DemoTowersOfHanoi.toh(3, 0, 1);
    }

    static void testBinarySearch() {
        int n;
        int[] a;
        int result;

        n = 3;
        a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        result = DemoBinarySearch.binarySearch(n, a, 0, a.length);
        System.out.printf("%s %s %s\n", n, Arrays.toString(a), result);

        n = 30;
        a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        result = DemoBinarySearch.binarySearch(n, a, 0, a.length);
        System.out.printf("%s %s %s\n", n, Arrays.toString(a), result);

        n = 30;
        a = new int[] {};
        result = DemoBinarySearch.binarySearch(n, a, 0, a.length);
        System.out.printf("%s %s %s\n", n, Arrays.toString(a), result);
    }

}
