package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise053;

public class TestList {

    public static void main(String[] args) {
        List myList;

        myList = new List();
        System.out.println(myList.size());

        myList.insert(0, 55);
        myList.insert(0, 40);

        myList.insert(2, 100);
        myList.print();

        myList.remove(0);
        myList.print();

        myList.remove(1);
        myList.print();
    }

}
