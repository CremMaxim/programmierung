package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise022;

public class Exercise022 {

    public static void main(String[] args) {
        long[] la;

        la = new long[20];
        for (int i=0; i<la.length; i++) {
            la[i] = 2L * i;
        }

        for (long l : la) {
            System.out.print(l + " ");
        }
        System.out.println();
    }

}
