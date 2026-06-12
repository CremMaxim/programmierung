package de.fhdw.set.bfwd425abfax425a.prg2.demos.demos20260330;

public class DemoMirrorString {

    static String mirrorString(String s) {
        int l;
        String result;

        l = s.length();
        if (l==0 || l==1) {
            result = s;
        }
        else {   // l>=2
            result = s.charAt(l-1) + mirrorString(s.substring(1, l-1)) + s.charAt(0);
        }
        return result;
    }

}
