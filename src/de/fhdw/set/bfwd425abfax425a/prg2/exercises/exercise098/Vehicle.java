package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise098;

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

    @Override
    public String toString() {
        return String.format("%s %s %s %s", mBrand, mModel, mPerformance, mBuildYear);
    }

    public boolean equals(Object obj) {
        Vehicle v1, v2;

        if (this==obj) {
            return true;
        }
        if (obj==null) {
            return false;
        }
        if (this.getClass()!=obj.getClass()) {
            return false;
        }
        v1 = this;
        v2 = (Vehicle) obj;
        return v1.mBrand.equals(v2.mBrand) &&
               v1.mModel.equals(v2.mModel) &&
               v1.mPerformance == v2.mPerformance &&
               v1.mBuildYear == v2.mBuildYear;
    }
}
