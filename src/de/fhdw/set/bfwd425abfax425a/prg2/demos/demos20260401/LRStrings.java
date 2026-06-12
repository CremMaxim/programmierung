package de.fhdw.set.bfwd425abfax425a.prg2.demos.demos20260401;

public class LRStrings {

    static String substituteMidCharByL(String s) {
        String result;
        int l;

        l = s.length();
        if (l==0) {   // s is empty string
            result = s;
        }
        else {  // l>=1
            if (l==1) {
                result = "L";
            }
            else {  // l>=2
                result = s.substring(0, (l-1)/2) + "L" + s.substring((l+1)/2);
            }
        }
        return result;
    }

    static String getLRString(int level) {
        String result;

        if (level==1) {
            result = "R";
        }
        else {   // level > 1
            String s;
            s = getLRString(level-1);
            result = s + "R" + substituteMidCharByL(s);
        }
        return result;
    }
}
