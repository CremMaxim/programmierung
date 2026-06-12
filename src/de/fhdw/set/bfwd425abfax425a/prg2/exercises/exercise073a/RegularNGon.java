package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise073a;

public class RegularNGon {

    public static void main(String[] args) {
        drawRegularNGon(3);
    }

    static void drawRegularNGon(int n) {
        double sideLength;
        double turtleAngle;
        double radius;
        double startX, startY, startAngle;
        Turtle t;

        turtleAngle = 360.0 / n;
        radius = 0.4;
        sideLength = 2 * radius * Math.sin(Math.PI/n);
        startX = 0.5;
        startY = 0.1;
        startAngle = turtleAngle / 2;
        t = new Turtle(startX, startY, startAngle);
        for (int i=0; i<n; i++) {
            t.goForward(sideLength);
            t.turnLeft(turtleAngle);
        }
    }

}
