package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise085a;

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

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s", getBrand(), getModel(), getPerformance(),
                getBuildYear(), getNumberOfDoors(), getBatteryCapacity());
    }

    @Override
    public boolean equals(Object obj) {
        ElectricCar e1, e2;

        if(!super.equals(obj)) {
            return false;
        }
        e1 = this;
        e2 = (ElectricCar) obj;
        return e1.getBatteryCapacity() == e2.getBatteryCapacity();
    }

}
