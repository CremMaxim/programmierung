package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise085;

public class Motorcycle extends Vehicle {

    private boolean mHasSideCar;

    Motorcycle(String brand, String model, double performance,
               int buildYear, boolean hasSideCar) {
        super(brand, model, performance, buildYear);
        setHasSideCar(hasSideCar);
    }

    public boolean hasSideCar() {
        return mHasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.mHasSideCar = hasSideCar;
    }

    @Override
    public String toString() {
        return String.format("Marke: %s\nModell: %s\nLeistung: %s\nBaujahr: %s\nBeiwagen vorhanden: %s\n",
                             getBrand(), getModel(), getPerformance(),
                             getBuildYear(), hasSideCar()?"ja":"nein");
    }

}
