package de.fhdw.set.bfwd425abfax425a.prg1.demos.demos20251111;

public class TestMyNumber {

    public static void main(String[] args) {
        MyNumber myNumber;
        MyNumber myNumber2;

        myNumber = new MyNumber();
        myNumber.print();
        myNumber.add(17);
        myNumber.print();
        myNumber.multiply(3);
        myNumber.print();

        myNumber2 = new MyNumber();
        myNumber2.add(1);
        myNumber2.multiply(10);
        myNumber2.print();

        myNumber.print();
    }
}
