package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise085a;

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

//    @Override
//    public boolean equals(Object obj) {
//        Car v1, v2;
//
//        if (this==obj) {
//            return true;
//        }
//        if (obj==null) {
//            return false;
//        }
//        if (this.getClass()!=obj.getClass()) {
//            return false;
//        }
//        v1 = this;
//        v2 = (Car) obj;
//        return v1.getBrand().equals(v2.getBrand()) &&
//               v1.getModel().equals(v2.getModel()) &&
//               v1.getPerformance() == v2.getPerformance() &&
//               v1.getNumberOfDoors() == v2.getNumberOfDoors() &&
//               v1.getBuildYear() == v2.getBuildYear();
//    }

    @Override
    public boolean equals(Object obj) {
        Car c1, c2;

        if(!super.equals(obj)) {
            return false;
        }
        c1 = this;
        c2 = (Car) obj;
        return c1.getBuildYear() == c2.getBuildYear();
    }

}

