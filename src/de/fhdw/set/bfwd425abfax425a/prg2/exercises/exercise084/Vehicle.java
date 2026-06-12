package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise084;

public class Vehicle {

    private String mBrand;
    private String mModel;
    private double mPerformance;
    private int mBuildYear;

    Vehicle(String brand, String model, double performance, int buildYear) {
        setBrand(brand);
        setModel(model);
        setPerformance(performance);
        setBuildYear(buildYear);
    }

    public String getBrand() {
        return mBrand;
    }

    public void setBrand(String brand) {
        this.mBrand = brand;
    }

    public String getModel() {
        return mModel;
    }

    public void setModel(String model) {
        this.mModel = model;
    }

    public double getPerformance() {
        return mPerformance;
    }

    public void setPerformance(double performance) {
        this.mPerformance = performance;
    }

    public int getBuildYear() {
        return mBuildYear;
    }

    public void setBuildYear(int buildYear) {
        this.mBuildYear = buildYear;
    }

}
