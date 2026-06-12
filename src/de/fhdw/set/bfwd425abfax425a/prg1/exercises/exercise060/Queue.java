package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise060;

public class Queue {

    List mList;

    Queue() {
        mList = new List();
    }

    boolean isEmpty() {
        return mList.size() == 0;
    }

    int first() {
        return mList.getFirst();
    }

    int dequeue() {
        int result;

        result = first();
        mList.remove(0);
        return result;
    }

    void enqueue(int newElement) {
        mList.insert(mList.size(), newElement);
    }

    void print() {
        mList.print();
    }

}
