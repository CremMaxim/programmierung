package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise085;

public class Car extends Vehicle {

    private int mNumberOfDoors;

    Car(String brand, String model, double performance, int buildYear,
        int numberOfDoors) {
        super(brand, model, performance, buildYear);
        setNumberOfDoors(numberOfDoors);
    }

    public int getNumberOfDoors() {
        return mNumberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.mNumberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", getBrand(), getModel(), getPerformance(),
                getBuildYear(), getNumberOfDoors());
    }

}
