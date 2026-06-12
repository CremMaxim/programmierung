package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise074;

public class KochCurve {

    public static void main(String[] args) {
        Turtle t;
        double step;
        int level;

        t = new Turtle(0.1, 0.75, 0.0);
        step = 0.01;
        level = 4;
        plotKochCurve(t, step, level);
        t.turnRight(120);
        plotKochCurve(t, step, level);
        t.turnRight(120);
        plotKochCurve(t, step, level);
    }
    static void plotKochCurve(Turtle t, double step, int level) {
        if (level==0) {
            t.goForward(step);
        }
        else {
            plotKochCurve(t, step, level - 1);
            t.turnLeft(60);
            plotKochCurve(t, step, level - 1);
            t.turnRight(120);
            plotKochCurve(t, step, level - 1);
            t.turnLeft(60);
            plotKochCurve(t, step, level - 1);
        }
    }

}
