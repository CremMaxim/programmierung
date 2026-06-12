package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise059;

public class List {
    ListNode mStartNode;
    int mSize;

    ListNode getNode(int position) {
        // assertion: position >= 0 && position < length of list
        ListNode result;

        result = mStartNode;
        while (position>0) {
            result = result.getSuccessor();
            position--;
        }
        return result;
    }

    int get(int position) {
        return this.getNode(position).getContent();
    }

    int getFirst() {
        return get(0);
    }

    void insert(int position, int newValue) {
        ListNode newNode;
        ListNode predecessor;

        newNode = new ListNode();
        newNode.setContent(newValue);
        if (position==0) {
            newNode.setSuccessor(mStartNode);
            mStartNode = newNode;
        }
        else {   // position > 0
            predecessor = getNode(position-1);
            newNode.setSuccessor(predecessor.getSuccessor());
            predecessor.setSuccessor(newNode);
        }
        mSize++;
    }

    void remove(int position) {
        // assertion: 0 <= position < mSize
        ListNode predecessor;

        if (position==0) {
            mStartNode = getNode(0).getSuccessor();
        }
        else {
            predecessor = getNode(position-1);
            predecessor.setSuccessor(getNode(position).getSuccessor());
        }
        mSize--;
    }

    int size() {
        return mSize;
    }

    String getString() {
        String result;

        result = "";
        for (int i=0; i<mSize; i++) {
            result += (get(i) + " ");
        }
        return result;
    }

    int[] toArray() {
        int[] result;

        result = new int[mSize];
        for (int i=0; i<mSize; i++) {
            result[i] = get(i);
        }
        return result;
    }

    void print() {
        System.out.println("[ " + getString() + "]");
    }

}
