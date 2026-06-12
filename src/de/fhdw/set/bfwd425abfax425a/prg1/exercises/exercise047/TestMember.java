package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise047;

public class TestMember {

    int mIntMember;
    String mStringMember;

    TestMember(int intMember, String stringMember) {
        setIntMember(intMember);
        setStringMember(stringMember);
    }

    public int getIntMember() {
        return this.mIntMember;
    }

    public void setIntMember(int intMember) {
        this.mIntMember = intMember;
    }

    public String getStringMember() {
        return mStringMember;
    }

    public void setStringMember(String stringMember) {
        this.mStringMember = stringMember;
    }
}
