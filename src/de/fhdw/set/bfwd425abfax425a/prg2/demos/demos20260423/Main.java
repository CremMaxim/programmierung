package de.fhdw.set.bfwd425abfax425a.prg2.demos.demos20260423;

public class Main {

    public static void main(String[] args) {
        Person p, p2, p3;
        Student s, s2, s3;

        p = new Person("Peter", 34);
        p3 = new Person("Peter", 34);
        s = new Student("Ute", 23, "443322");
        s3 = new Student("Ute", 23, "443311");

        System.out.println(s.getName());
        System.out.println(s.getRegistrationNumber());

        p2 = new Student("Rita", 19, "556543");
        System.out.println(((Student) p2).getRegistrationNumber());
        // s2 = (Student)p;  // ClassCastException

        System.out.println(p);
        System.out.println(s);

        if (p.equals(p3)) {
            System.out.println("Personen sind gleich!");
        }
        else {
            System.out.println("Personen sind ungleich!");
        }

        if (s.equals(s3)) {
            System.out.println("Personen sind gleich!");
        }
        else {
            System.out.println("Personen sind ungleich!");
        }
    }

}
