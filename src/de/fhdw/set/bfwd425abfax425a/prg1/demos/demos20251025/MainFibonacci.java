package de.fhdw.set.bfwd425abfax425a.prg1.demos.demos20251025;

import java.util.Arrays;

public class MainFibonacci {

    public static void main(String[] args) {
        int[] ia;

        ia = DemoFibonacci.fibonacci(20);
        System.out.println(Arrays.toString(ia));

        int[] ia2;
        ia2 = new int[20];
        DemoFibonacci.fibonacci2(ia2);
        System.out.println(Arrays.toString(ia2));
    }
}
