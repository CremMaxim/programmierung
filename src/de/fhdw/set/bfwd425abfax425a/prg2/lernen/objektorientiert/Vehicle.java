package de.fhdw.set.bfwd425abfax425a.prg2.lernen.objektorientiert;

public class Vehicle {
    private String mBrand;
    private int mMaxSpeed;

    public Vehicle(String brand, int maxSpeed){
        mBrand = brand;
        mMaxSpeed = maxSpeed;
    }

    public String getBrand(){
        return mBrand;
    }

    public void setBrand(String brand){
        this.mBrand = brand;
    }

    public int getMaxSpeed(){
        return mMaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.mMaxSpeed = maxSpeed;
    }

    @Override
    public String toString(){
        return "Vehicle[brand=" + mBrand + ", maxSpeed=" + mMaxSpeed + "]";
        // Intellij zeigt schon, dass das erste + falsch ist. Aber so hätte ich es gemacht
    }
}
