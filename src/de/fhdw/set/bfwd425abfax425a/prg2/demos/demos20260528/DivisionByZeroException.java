package de.fhdw.set.bfwd425abfax425a.prg2.demos.demos20260528;

public class DivisionByZeroException extends ArithmeticException {

    private int mDivisor;

    DivisionByZeroException(int divisor) {
        mDivisor = divisor;
    }

    @Override
    public String getMessage() {
        return String.format(
                "Es wurde versucht die Zahl %s durch 0 zu teilen!",
                mDivisor);
    }

}
