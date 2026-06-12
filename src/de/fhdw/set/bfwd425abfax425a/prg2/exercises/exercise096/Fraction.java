package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise096;

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
        if (denominator.signum()==0) {
            throw new DenominatorMustNotBeZeroException();
        }
        this.mDenominator = denominator;
    }

    @Override
    public String toString() {
        return String.format("%s / %s",
                             getNumerator(), getDenominator());
    }

    public Fraction add(Fraction f2) {
        BigInteger a, b, c, d;

        a = this.getNumerator();
        b = this.getDenominator();
        c = f2.getNumerator();
        d = f2.getDenominator();

        return new Fraction(a.multiply(d).add(b.multiply(c)),
                            b.multiply(d));
    }

    public Fraction normalize() {
        BigInteger gcd;
        BigInteger num, den;

        num = this.getNumerator();
        den = this.getDenominator();
        gcd = num.gcd(den);
        num = num.divide(gcd);
        den = den.divide(gcd);
        if (den.signum()<0) {
            num = num.negate();
            den = den.negate();
        }
        return new Fraction(num, den);
    }

    @Override
    public boolean equals(Object obj) {
        Fraction f1, f2;

        if (this==obj) {
            return true;
        }
        if (obj==null) {
            return false;
        }
        if (this.getClass()!=obj.getClass()) {
            return false;
        }
        f1 = this.normalize();
        f2 = ((Fraction) obj).normalize();
        return f1.getNumerator().equals(f2.getNumerator()) &&
                f1.getDenominator().equals(f2.getDenominator());
    }

}
