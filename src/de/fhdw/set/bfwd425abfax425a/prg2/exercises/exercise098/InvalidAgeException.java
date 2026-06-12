package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise098;

public class InvalidAgeException extends IllegalArgumentException {

    private int mInvalidAge;

    InvalidAgeException(int invalidAge) {
        mInvalidAge = invalidAge;
    }

    @Override
    public String getMessage() {
        return String.format("Das Alter %s ist unzulässig!", mInvalidAge);
    }

}
