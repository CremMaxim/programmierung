package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise033.exercise033f;

public class Main {

    public static void main(String[] args) {
        int[] result = new int[2];
        getTwoValues2(result);
    }

    static int[] getTwoValues() {
        int a, b;
        // calculate a and b
        a = 34;
        b = 56;

        int[] result = new int[] {a, b};
        return result;
    }

    static void getTwoValues2(int[] result) {
        int a, b;
        // calculate a and b
        a = 34;
        b = 56;

        result[0] = a;
        result[1] = b;
    }
}
