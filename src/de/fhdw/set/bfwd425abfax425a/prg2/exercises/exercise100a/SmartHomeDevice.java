package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise100a;

public class SmartHomeDevice implements Switchable {

    private String mName;

    SmartHomeDevice(String name) {
        mName = name;
    }

    @Override
    public void turnOn() {
        System.out.printf("SmartHomeDevice \"%s\" eingeschaltet!\n", mName);
    }

    @Override
    public void turnOff() {
        System.out.printf("SmartHomeDevice \"%s\" ausgeschaltet!", mName);
    }

}
