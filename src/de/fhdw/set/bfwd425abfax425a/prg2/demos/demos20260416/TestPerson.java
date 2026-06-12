package de.fhdw.set.bfwd425abfax425a.prg2.demos.demos20260416;

public class TestPerson {

    public static void main(String[] args) {
        Person p, p2;

        p = new Person();
        p.setAge(20);
        p.setName("Ute");

        p2 = new Person("Peter", 34);
        p2.setAge(p2.getAge()+1);  // peter birthday

        System.out.println(Person.getNumberOfPersons());
        System.out.println(p2);
        System.out.printf("%s ist %s Jahre alt.\n", p2.getName(), p2.getAge());
        System.out.printf("%s (%s)\n", p2.getName(), p2.getAge());
    }
}
