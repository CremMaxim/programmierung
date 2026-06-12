package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise098;

public class Main {

    public static void main(String[] args) {
        Identifiable[] carsAndPersons;

        carsAndPersons = new Identifiable[] {
            new Person("Peter", 19),
            new Car("VW", "Golf", 55.0, 2023, 4),
            new Car("VW", "Polo", 65.0, 2019, 2),
            new Person("Ute", 25)
        };

        for (Identifiable carOrPerson : carsAndPersons) {
            System.out.println(carOrPerson.getId());
        }
    }
}
