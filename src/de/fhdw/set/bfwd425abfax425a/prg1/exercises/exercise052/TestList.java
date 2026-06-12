package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise052;

import java.util.Arrays;

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

        myList.insert(0, 12);
        myList.insert(0, 44);
        myList.print();

        System.out.println( Arrays.toString(myList.toArray()) );
    }

}
