package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise041;

public class TestPalindrome {

    public static void main(String[] args) {
        String s;
        boolean expectedResult;

        s = "ABBA";
        expectedResult = true;
        if (expectedResult != Palindrome.isPalindrome(s)) {
            System.out.println("Fehler entdeckt!");
            System.out.println(s);
        }

        s = "ABbA";
        expectedResult = false;
        if (expectedResult != Palindrome.isPalindrome(s)) {
            System.out.println("Fehler entdeckt!");
            System.out.println(s);
        }
        s = "";
        expectedResult = true;
        if (expectedResult != Palindrome.isPalindrome(s)) {
            System.out.println("Fehler entdeckt!");
            System.out.println(s);
        }
    }
}
