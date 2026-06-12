package de.fhdw.set.bfwd425abfax425a.prg2.demos.demos20260430;

import java.math.BigInteger;

public class DemosBigInteger {

    public static void main(String[] args) {
        BigInteger bi1;
        BigInteger bi2;
        BigInteger bi3;

        bi1 = new BigInteger("12");
        bi2 = new BigInteger("6");

        bi3 = bi1.add(bi2);
        bi3 = bi1.multiply(bi2);
        bi3 = bi1.subtract(bi2);
        bi3 = bi1.divide(bi2);
        System.out.println(bi1.negate());
        System.out.println(bi1.signum());
        System.out.println(bi1.negate().signum());
        System.out.println((new BigInteger("0")).signum());
        System.out.println(BigInteger.ZERO.signum());
        System.out.println(BigInteger.ONE);
        System.out.println(BigInteger.TWO);
        System.out.println(BigInteger.TEN);
        bi3 = new BigInteger("145").gcd(new BigInteger("75"));
        System.out.println(bi3);
        bi3 = new BigInteger("157").mod(new BigInteger("75"));
        System.out.println(bi3);
        bi3 = new BigInteger("157").pow(367);
        System.out.println(bi3);

        // 1 < 45
        // BigInteger.ONE.compareTo(new BigInteger("45")) < 0
        // 100 < 45
        // BigInteger.(new BigInteger("100")).compareTo(new BigInteger("45")) < 0
        // 100 <= 45
        // BigInteger.(new BigInteger("100")).compareTo(new BigInteger("45")) <= 0
        // 5 == 17
        // BigInteger.(new BigInteger("5")).compareTo(new BigInteger("17")) == 0

        // for (int i=1; i<=100; i++) {
        //     System.out.println(i);
        // }
        for (BigInteger i=BigInteger.ONE; i.compareTo(new BigInteger("100"))<=0;
             i = i.add(BigInteger.ONE)) {
            System.out.println(i);
        }
    }

}
