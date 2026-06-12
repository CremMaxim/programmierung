package de.fhdw.set.bfwd425abfax425a.prg1.demos.demos20251025;

public class DemoFibonacci {

    static int[] fibonacci(int n) {
        int a, b, i, old_a;

        a = 0;
        b = 1;
        i = 1;
        int[] fibArray = new int[n];
        while (i<=n) {
            fibArray[i-1] = b;
            old_a = a;
            a = b;
            b = old_a + b;
            i = i + 1;
        }
        return fibArray;
    }

    static void fibonacci2(int[] fibArray) {
        int a, b, i, old_a, n;

        a = 0;
        b = 1;
        i = 1;
        n = fibArray.length;
        while (i<=n) {
            fibArray[i-1] = b;
            old_a = a;
            a = b;
            b = old_a + b;
            i = i + 1;
        }
    }

}
