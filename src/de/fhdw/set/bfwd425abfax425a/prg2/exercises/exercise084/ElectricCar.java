package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise084;

public class ElectricCar extends Car {

    private double mBatteryCapacity;

    ElectricCar(String brand, String model, double performance, int buildYear,
                int numberOfDoors, double batteryVoltage) {
        super(brand, model, performance, buildYear, numberOfDoors);
        setBatteryCapacity(batteryVoltage);
    }

    public double getBatteryCapacity() {
        return mBatteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.mBatteryCapacity = batteryCapacity;
    }

}
