package de.fhdw.set.bfwd425abfax425a.prg1.demos.demos20251117;

public class Greeter {

    String mGreeting;

    Greeter(String greeting) {
        mGreeting = greeting;
    }

    void greet() {
        System.out.println(this.mGreeting);
    }

    void setGreeting(String greeting) {
        this.mGreeting = greeting;
    }

    String getGreeting() {
        return mGreeting;
    }

}
