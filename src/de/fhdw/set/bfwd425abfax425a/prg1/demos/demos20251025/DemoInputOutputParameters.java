package de.fhdw.set.bfwd425abfax425a.prg1.demos.demos20251025;

public class DemoInputOutputParameters {

    static void getRandomNumbers(double[] outputParameters) {
        for (int i=0; i<outputParameters.length; i++) {
            outputParameters[i] = Math.random();
        }
    }

    static double getMaximum(double[] inputParameters) {
        // assert: inputParameters.length >= 1
        double maximum;

        maximum = inputParameters[0];
        for (double currentValue : inputParameters) {
            if (currentValue > maximum) {
                maximum = currentValue;
            }
        }
        return maximum;
    }

    static void swap(double[] inputOutputParameter) {
        // assert: inputParameters.length >= 2
        double help;

        help = inputOutputParameter[0];
        inputOutputParameter[0] = inputOutputParameter[1];
        inputOutputParameter[1] = help;
    }


}
