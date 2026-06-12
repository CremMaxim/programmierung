package de.fhdw.set.bfwd425abfax425a.prg2.demos.demos20260401;

public class PlotLRString {

    public static void main(String[] args) {
        Turtle t;
        String lrs;
        double step;
        int level;

        level = 14;
        step = 0.005;
        t = new Turtle(0.6, 0.3, 0.0);
        lrs = LRStrings.getLRString(level);
        System.out.println(lrs);
        plotString(t, step, lrs);
    }
    static void plotChar(Turtle t, double step, char lOrR) {
        switch (lOrR) {
            case 'L':
                t.turnLeft(90);
                t.goForward(step);
                break;
            case 'R':
                t.turnRight(90);
                t.goForward(step);
                break;
        }
    }

    static void plotString(Turtle t, double step, String s) {
        for (char lOrR : s.toCharArray()) {
            plotChar(t, step, lOrR);
        }
    }

}
