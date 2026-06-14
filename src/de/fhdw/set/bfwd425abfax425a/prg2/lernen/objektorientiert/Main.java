package de.fhdw.set.bfwd425abfax425a.prg2.lernen.objektorientiert;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car("BMW", 200, 4);
        System.out.println(v1.toString());

        Car c = new Car("BMW", 200, 4);
        System.out.println(c.getNumberOfDoors());

        Garage g = new Garage();
        Car v = new Car("BMW", 200, 4);
        g.park(v);
    }
}
