package de.fhdw.set.bfwd425abfax425a.prg1.demos.demos20251111;

public class DemoStringMethods {

    public static void main(String[] args) {
        int result;
        boolean result2;

        result = "FHDWFHDWFHDW".indexOf("WFH");
        System.out.println(result);

        result = "FHDWFHDWFHDW".indexOf("FOM");
        System.out.println(result);

        result2 = "FHDWFHDWFHDW".contains("WFH");
        System.out.println(result2);

        result2 = "FHDWFHDWFHDW".contains("FOM");
        System.out.println(result2);

        result2 = "FHDWFHDWFHDW".startsWith("FHDW");
        System.out.println(result2);

        result2 = "FHDWFHDWFHDW".startsWith("FI");
        System.out.println(result2);

        result2 = "FHDWFHDWFHDW".endsWith("FHDW");
        System.out.println(result2);

        result2 = "FHDWFHDWFHDW".endsWith("FHDU");
        System.out.println(result2);
    }
}
