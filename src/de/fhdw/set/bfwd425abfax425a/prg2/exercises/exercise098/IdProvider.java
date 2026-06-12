package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise098;

public class IdProvider {

    static int nextId = 0;

    static int getNextId() {
        return nextId++;
    }

}
