package de.fhdw.set.bfwd425abfax425a.prg2.demos.demos20260528;

public class DemoExceptions2 {

    public static void main(String[] args) {
        System.out.println("main called!");
        a();
        System.out.println("in main nach Aufruf von a");
    }

    private static void a() {
        System.out.println("a called!");
        b();
        System.out.println("in a nach Aufruf von b");
    }

    private static void b() {
        System.out.println("b called!");
        c();
        System.out.println("in b nach Aufruf von c");
    }

    private static void c() {
        System.out.println("c called!");
        try {
            throw new RuntimeException();
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException wurde geworfen!");
        }
        System.out.println("end of c");
    }


}
