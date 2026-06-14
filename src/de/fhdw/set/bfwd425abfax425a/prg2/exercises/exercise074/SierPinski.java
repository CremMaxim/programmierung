package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise074;

public class SierPinski {
    public static void sierpinski(Turtle turtle, int level, double laenge) {
        if (level == 0) {
            // einfaches gleichseitiges Dreieck: 3 Kanten, 3 Drehungen (3 × 120° = 360°)
            turtle.goForward(laenge);
            turtle.turnLeft(120);
            turtle.goForward(laenge);
            turtle.turnLeft(120);
            turtle.goForward(laenge);
            turtle.turnLeft(120);
        } else {
            sierpinski(turtle, level - 1, laenge / 2);   // unten links
            turtle.goForward(laenge / 2);                 // → unten rechts
            sierpinski(turtle, level - 1, laenge / 2);   // unten rechts
            turtle.turnLeft(120);
            turtle.goForward(laenge / 2);                 // → hoch zur Start-Ecke des oberen Dreiecks
            turtle.turnRight(120);                        // WICHTIG: wieder auf 0° ausrichten!
            sierpinski(turtle, level - 1, laenge / 2);   // oben
            turtle.turnRight(120);                        // Richtung unten-links einnehmen
            turtle.goForward(laenge / 2);                 // → zurück nach unten links
            turtle.turnLeft(120);                         // Startrichtung (0°) wiederherstellen
        }
    }

    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();
        Turtle turtle = new Turtle(0.1, 0.1, 0);  // unten links, Blick nach rechts (0°)
        sierpinski(turtle, 10, 0.8);
        turtle.show();
    }
}