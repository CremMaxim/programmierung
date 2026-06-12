package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise036;

public class TestCircle {

    public static void main(String[] args) {
        Circle circle;

        circle = new Circle();
        circle.setRadius(3.0);
        circle.setCenterX(10.0);
        circle.setCenterY(12.0);
        System.out.println(circle.getArea());
    }
}
