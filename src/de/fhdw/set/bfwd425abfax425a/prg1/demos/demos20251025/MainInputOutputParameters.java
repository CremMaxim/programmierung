package de.fhdw.set.bfwd425abfax425a.prg1.demos.demos20251025;

import java.util.Arrays;

public class MainInputOutputParameters {

    public static void main(String[] args) {
        double[] doubleArray;
        doubleArray = new double[5];
        double result;

        DemoInputOutputParameters.getRandomNumbers(doubleArray);
        System.out.println(Arrays.toString(doubleArray));

        result = DemoInputOutputParameters.getMaximum(doubleArray);
        System.out.println(result);

        System.out.println(Arrays.toString(doubleArray));
        DemoInputOutputParameters.swap(doubleArray);
        System.out.println(Arrays.toString(doubleArray));
    }

}
