package de.fhdw.set.bfwd425abfax425a.prg1.demos.demos20251010;

public class DemoMethodCalls {

    public static void main(String[] args) {
        secondMethod();
        DemoMethodCallsTwo.secondMethod();
        de.fhdw.set.bfwd425abfax425a.prg1.demos.demos20251010a.DemoMethodCalls.secondMethod();
    }

    public static void secondMethod() {
        System.out.println("Dies ist secondMethod!");
        System.out.println("Dies ist secondMethod nochmal!");
    }

}
