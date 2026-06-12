package de.fhdw.set.bfwd425abfax425a.prg1.demos.demos20251015;

public class Tree {

    static void drawTree(int height) {
        drawTreetop(height);
        drawTrunc(height-1);
    }

    private static void drawTreetop(int height) {
        int blanks, stars;

        for (int line=1; line<=height; line+=1) {
            blanks = height - line;
            stars = 2 * line - 1;
            drawTreetopLine(blanks, stars);
        }
    }

    private static void drawTreetopLine(int blanks, int stars) {
        drawBlanksStars(blanks, stars);
        System.out.println();
    }

    private static void drawBlanksStars(int blanks, int stars) {
        drawBlanks(blanks);
        drawStars(stars);
    }

    private static void drawTrunc(int distance) {
        drawBlanks(distance);
        System.out.println('|');
        drawBlanks(distance);
        System.out.println('|');
    }

    private static void drawBlanks(int numberOfBlanks) {
        repeatCharacters(numberOfBlanks, ' ');
    }

    private static void drawStars(int numberOfStars) {
        repeatCharacters(numberOfStars, '*');
    }

    private static void repeatCharacters(int numberOfCharacters, char c) {
        for (int i=1; i<=numberOfCharacters; i++) {
            System.out.print(c);
        }
    }

}
