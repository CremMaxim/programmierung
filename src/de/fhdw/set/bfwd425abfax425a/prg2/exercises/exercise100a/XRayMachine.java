package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise100a;

public class XRayMachine implements Switchable {

    private String mName;

    XRayMachine(String name) {
        mName = name;
    }

    @Override
    public void turnOn() {
        System.out.printf("Maschine \"%s\" eingeschaltet!\n", mName);
    }

    @Override
    public void turnOff() {
        System.out.printf("Maschine \"%s\" ausgeschaltet!\n", mName);
    }

}
