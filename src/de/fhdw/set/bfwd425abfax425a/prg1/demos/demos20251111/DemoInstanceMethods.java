package de.fhdw.set.bfwd425abfax425a.prg1.demos.demos20251111;

public class DemoInstanceMethods {

    public static void main(String[] args) {
        Greeter greeter;
        Greeter greeter2;

        greeter = new Greeter();
        greeter.setGreeting("Hallo Welt");
        greeter.greet();
        // greet();  does not work!

        greeter2 = new Greeter();
        greeter2.setGreeting("Guten Morgen");
        greeter2.greet();

        greeter.greet();
    }
}
