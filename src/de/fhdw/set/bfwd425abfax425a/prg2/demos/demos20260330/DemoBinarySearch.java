package de.fhdw.set.bfwd425abfax425a.prg2.demos.demos20260330;

public class DemoBinarySearch {

    static int binarySearch(int n, int[] a, int start, int end) {
        int result;

        if (end-start<=0) {
            result = -1;
        }
        else {    // a.length >= 1
            if (end-start==1) {
                if (n==a[start]) {
                    result = start;
                }
                else {
                    result = -1;
                }
                // expr1 ? expr2 : expr3
                result = n==a[start] ? start : -1;
            }
            else {   // a.length >= 2
                int midPos;

                midPos = start + (end-start) / 2;
                if (n==a[midPos]) {
                    result = midPos;
                }
                else {
                    if (n<a[midPos]) {
                        System.out.printf("n=%s start=%s midPos=%s, end=%s\n", n, start, midPos, end);
                        result = binarySearch(n, a, start, midPos);
                    }
                    else {  // n>a[midPos]
                        System.out.printf("n=%s start=%s midPos=%s, end=%s\n", n, start, midPos, end);
                        result = binarySearch(n, a, midPos+1, end);
                    }
                }
            }
        }
        return result;
    }
}
