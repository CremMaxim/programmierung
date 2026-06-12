package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise041;

public class Palindrome {

    static boolean isPalindrome(String s) {
        boolean result;

        result = true;
        for (int i=0; i<s.length()/2; i++) {
            if ( s.charAt(i) != s.charAt(s.length()-i-1) ) {
                result = false;
                break;
            }
        }
        return result;
    }

}
