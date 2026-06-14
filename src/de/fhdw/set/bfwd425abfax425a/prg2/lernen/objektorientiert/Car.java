package de.fhdw.set.bfwd425abfax425a.prg2.lernen.objektorientiert;

public class Car extends Vehicle {
    private int mNumberOfDoors;

    public Car(String brand, int maxSpeed, int numbereOfDoors){
        super(brand, maxSpeed);
        mNumberOfDoors = numbereOfDoors;
    }

    public int getNumberOfDoors(){
        return mNumberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors){
        this.mNumberOfDoors = numberOfDoors;
    }

    @Override
    public String toString(){
        return super.toString() + ", doors=" + mNumberOfDoors;
    }

    @Override
    public boolean equals(Object obj) {
        Car c1, c2;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        c1 = this;
        c2 = (Car) obj;
        return c1.getBrand().equals(c2.getBrand())   // String → .equals()
                && c1.getMaxSpeed() == c2.getMaxSpeed()       // int → ==
                && c1.getNumberOfDoors() == c2.getNumberOfDoors();
    }
}
