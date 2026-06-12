package de.fhdw.set.bfwd425abfax425a.prg1.demos.demos20251025;

import java.util.Arrays;

public class DemoArrays {

    public static void main(String[] args) {
        Object[] o;
        o = new Object[10];

        o[2] = new Object();

        String[] sa;
        sa = new String[5];

        sa[4] = new String("FHDW");
        sa[4] = "FHDW";


        byte[] ba;
        ba = new byte[25];

        ba[ba.length-1] = 123;

        int i;
        i = 0;
        while ( i<=ba.length-1 ) {
            ba[i] = 23;
            i++;
        }
        for (int j=0; j<ba.length; j++) {
            System.out.println(ba[j]);
        }

        for (int j=0; j<sa.length; j++) {
            System.out.println(sa[j]);
        }
        for (String s : sa) {
            System.out.println(s);
        }

        int[] myIntArray;
        myIntArray = new int[5];
        for (int ii=0; ii<myIntArray.length; ii++) {
            myIntArray[ii] = 2 * ii;
        }
        int[] result;
        result = getThirdAndFourth(myIntArray);
        System.out.println(Arrays.toString(result));
    }

    static int[] getThirdAndFourth(int[] intArray) {
        int third;
        int fourth;
        int[] resultArray;

        third = intArray[2];
        fourth = intArray[3];

        resultArray = new int[2];
        resultArray[0] = third;
        resultArray[1] = fourth;
        return resultArray;
    }
}
