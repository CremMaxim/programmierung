package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise095;

public class Person {

    private String mName;
    private int mAge;

    private static int numberOfPersons = 0;

    private static final String DEFAULTNAME = "Michael";
    private static final int DEFAULTAGE = 18;
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 100;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
        numberOfPersons++;
    }

    public Person() {
        this(DEFAULTNAME, DEFAULTAGE);
    }

    public Person(String name) {
        this(name, DEFAULTAGE);
    }

    public Person(Person p) {
        this(p.mName, p.mAge);
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        if (age<MIN_AGE || age>MAX_AGE) {
            throw new InvalidAgeException(age);
        }
        mAge = age;
    }

    public static int getNumberOfPersons() {
        return numberOfPersons;
    }

    @Override
    public String toString() {
        return mName + " (" + mAge + ")";
    }

    @Override
    public boolean equals(Object obj) {
        Person p1, p2;

        if (this==obj) {
            return true;
        }
        if (obj==null) {
            return false;
        }
        if (this.getClass()!=obj.getClass()) {
            return false;
        }
        p1 = this;
        p2 = (Person) obj;
        return p1.mName.equals(p2.mName) && p1.mAge == p2.mAge;
        // return super.equals(obj);
    }

}
