package de.fhdw.set.bfwd425abfax425a.prg2.demos.demos20260330;

public class DemoArraySum {

    static int[] removeLast(int[] a) {
        int[] result;

        result = new int[a.length-1];
        for (int i=0; i<a.length-1; i++) {
            result[i] = a[i];
        }
        return result;
    }

    static int sum(int[] a) {
        int result;

        if (a.length==0) {
            result = 0;
        }
        else {   // a.length>0
            result = sum(removeLast(a)) + a[a.length-1];
        }
        return result;
    }

}
