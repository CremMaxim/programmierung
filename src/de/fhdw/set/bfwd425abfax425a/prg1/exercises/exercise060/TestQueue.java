package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise060;

public class TestQueue {

    public static void main(String[] args) {
        Queue queue;

        queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.print();
        queue.dequeue();
        queue.print();
    }
}
