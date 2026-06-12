package de.fhdw.set.bfwd425abfax425a.prg2.demos.demos20260528;

public class DemoExceptions {

    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("RuntimeException");
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
