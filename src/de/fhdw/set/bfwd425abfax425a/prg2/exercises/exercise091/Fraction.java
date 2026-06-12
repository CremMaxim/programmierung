package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise091;

import java.math.BigInteger;

public class Fraction {

    private BigInteger mNumerator;
    private BigInteger mDenominator;

    private final static BigInteger DEFAULT_NUMERATOR = BigInteger.ONE;
    private final static BigInteger DEFAULT_DENOMINATOR = BigInteger.ONE;

    public Fraction(BigInteger numerator, BigInteger denominator) {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public Fraction(long numerator, long denominator) {
        setNumerator(BigInteger.valueOf(numerator));
        setDenominator(BigInteger.valueOf(denominator));
    }

    public Fraction(Fraction f) {
        this(f.getNumerator(), f.getDenominator());
    }

    public Fraction() {
        this(DEFAULT_NUMERATOR, DEFAULT_DENOMINATOR);
    }

    public BigInteger getNumerator() {
        return mNumerator;
    }

    private void setNumerator(BigInteger numerator) {
        this.mNumerator = numerator;
    }

    public BigInteger getDenominator() {
        return mDenominator;
    }

    private void setDenominator(BigInteger denominator) {
        if (denominator.signum()!=0) {
            this.mDenominator = denominator;
        }
    }

}
