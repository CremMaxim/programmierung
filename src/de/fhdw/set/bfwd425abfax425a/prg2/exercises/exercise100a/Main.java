package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise100a;

public class Main {

    public static void main(String[] args) {
        Switchable[] devices;

        devices = new Switchable[] {
            new SmartHomeDevice("HiFi Anlage"),
            new XRayMachine("Röntgengerät Raum D04"),
            new XRayMachine("Röntgengerät Raum D07"),
            new SmartHomeDevice("Küchen Beleuchtung")
        };

        for (Switchable device : devices) {
            device.turnOn();
        }
    }
}
