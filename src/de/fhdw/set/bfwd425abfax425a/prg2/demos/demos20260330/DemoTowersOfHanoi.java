package de.fhdw.set.bfwd425abfax425a.prg2.demos.demos20260330;

public class DemoTowersOfHanoi {

    static void toh(int n, int from, int to) {
        int h;

        if (n==1) {
            System.out.println(from + " -> " + to);
        }
        else {
            // from + to + h = 3 <=> h = 3 - from - to
            h = 3 - from - to;
            toh(n - 1, from, h);
            System.out.println(from + " -> " + to);
            toh(n - 1, h, to);
        }
    }

}
