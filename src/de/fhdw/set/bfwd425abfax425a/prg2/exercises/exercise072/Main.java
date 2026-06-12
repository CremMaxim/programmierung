package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise072;

public class Main {

    public static void main(String[] args) {
        String result;

        for (int level=1; level<=5; level++) {
            result = LRStrings.getLRString(level);
            System.out.printf("%s: %s\n", level, result);
        }
    }

}
