package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise036;

public class Circle {

    double mCenterX;
    double mCenterY;
    double mRadius;

    void setCenterX(double centerX) {
        this.mCenterX = centerX;
    }

    void setCenterY(double centerY) {
        this.mCenterY = centerY;
    }

    void setRadius(double radius) {
        this.mRadius = radius;
    }

    double getArea() {
        return this.mRadius * this.mRadius * 3.14159;
    }

}
