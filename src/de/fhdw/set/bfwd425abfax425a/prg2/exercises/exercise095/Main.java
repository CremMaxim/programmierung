package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise095;

public class Main {

    public static void main(String[] args) {
        Person p;

        try {
            p = new Person("Ute", 102);
        }
        catch (InvalidAgeException iae) {
            // System.out.println("Dieses Alter ist nicht zulässig!");
        }
        p = new Person("Ute", 102);
    }
}
