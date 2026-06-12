package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise051;

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

    int size() {
        return mSize;
    }

}
