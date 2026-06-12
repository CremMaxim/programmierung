package de.fhdw.set.bfwd425abfax425a.prg2.demos.demos20260528;

public class Main {

    public static void main(String[] args) {
        MyInterface mi;

        mi = new DemoInterface1();

        mi.a();
        mi.b();

        mi = new DemoInterface2();
        mi.a();
        mi.b();

        ((DemoInterface2) mi).demoInterface2Method();
    }
}
