package de.fhdw.set.bfwd425abfax425a.prg2.demos.demos20260430;

public class Student extends Person {

    private String mRegistrationNumber;

    Student(String name, int age, String registrationNumber) {
        super(name, age);
        setRegistrationNumber(registrationNumber);
    }

    public void setRegistrationNumber(String registrationNumber) {
        mRegistrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return mRegistrationNumber;
    }

    @Override
    public String toString() {
        // return getName() + " (" + getAge() + "," + mRegistrationNumber + ")";
        return super.toString() + " (" + mRegistrationNumber + ")";
    }

    @Override
    public boolean equals(Object obj) {
        Student s1, s2;

        if (this==obj) {
            return true;
        }
        if (obj==null) {
            return false;
        }
        if(this.getClass()!=obj.getClass()) {
            return false;
        }

        s1 = this;
        s2 = (Student) obj;

        return s1.getName().equals(s2.getName()) &&
               s1.getAge() == s2.getAge() &&
               s1.mRegistrationNumber.equals(s2.mRegistrationNumber);
        // return super.equals(obj);
    }
}
