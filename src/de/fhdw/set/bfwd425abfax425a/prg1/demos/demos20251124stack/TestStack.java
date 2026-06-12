package de.fhdw.set.bfwd425abfax425a.prg1.demos.demos20251124stack;

public class TestStack {

    public static void main(String[] args) {
        Stack stack, stack2;
        int element, sum;

        stack = new Stack();
        stack2 = new Stack();
        stack.print();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // stack.pop();
        // stack.print();

        stack.print();
        sum = sumOfStackElements(stack);
        stack.print();
        System.out.println(String.format("Die Summe der Elemente ist gleich %s", sum));

    }

    static int sumOfStackElements(Stack stack) {
        int element, sum;
        Stack stack2;

        stack2 = new Stack();
        sum = 0;
        while ( !stack.isEmpty() ) {
            element = stack.pop();
            sum += element;
            stack2.push(element);
        }
        while ( !stack2.isEmpty() ) {
            element = stack2.pop();
            stack.push(element);
        }
        return sum;
    }

}
