package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise059;

public class Main {

    public static void main(String[] args) {
        Stack stack;
        boolean result;

        stack = new Stack();

        stack.push(-1);
        stack.push(-2);
        stack.push(-3);
        stack.push(1);
        stack.push(2);

        result = isNonNegativeCountGreaterOrEqualNegativeCount(stack);
        System.out.println(result);

        stack.push(3);
        stack.push(4);

        result = isNonNegativeCountGreaterOrEqualNegativeCount(stack);
        System.out.println(result);
    }

    static boolean isNonNegativeCountGreaterOrEqualNegativeCount(Stack stack) {
        int element;
        int countNonNegatives;
        int countNegatives;
        Stack stack2;

        stack2 = new Stack();
        countNonNegatives = 0;
        countNegatives = 0;
        while ( !stack.isEmpty() ) {
            element = stack.pop();
            if (element>=0) {
                countNonNegatives++;
            }
            else {
                countNegatives++;
            }
            stack2.push(element);
        }
        while ( !stack2.isEmpty() ) {
            element = stack2.pop();
            stack.push(element);
        }
        return countNonNegatives >= countNegatives;
    }

}
