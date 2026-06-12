package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise060;

public class Stack {
    List mList;

    Stack() {
        mList = new List();
    }

    boolean isEmpty() {
        return mList.size() == 0;
    }

    int top() {
        return mList.getFirst();
    }

    int pop() {
        int result;

        result = top();
        mList.remove(0);
        return result;
    }

    void push(int newElement) {
        mList.insert(0, newElement);
    }

    void print() {
        mList.print();
    }
}
