package de.fhdw.set.bfwd425abfax425a.prg1.demos.demos20251117;

public class DemoStringInstanceMethods {

    public static void main(String[] args) {
        String s;

        s = "FHDWUNIKÖLN".substring(2, 5);
        System.out.println(s);

        s = "FHDWUNIKÖLN".substring(2);
        System.out.println(s);

        System.out.println("FHDW".charAt(2));

        System.out.println("FHDWFHDWFHDW".length());

        System.out.println("FHDWFHDWFHDW".replace("D", "der"));

        System.out.println("abcABC123!\"§".toUpperCase());
        System.out.println("abcABC123!\"§".toLowerCase());

        System.out.println("FHDW".equals("FHdW"));
        System.out.println("FHDW".equals("FHDW"));
        String t = "D";
        System.out.println("FHDW" == "FH" + t + "W");
        System.out.println("FHDW".equals("FH" + t + "W"));

        System.out.println("FHDW" + "FHDW");
        System.out.println("FHDW".concat("FHDW"));

        System.out.println(String.valueOf(1234.6789).contains("2"));

        String name;
        int age;

        name = "Peter";
        age = 15;
        System.out.println(name + " ist " + age + " Jahre alt.");
        System.out.println(String.format("%s ist %s Jahre alt.", name, age));

        for (char c : "FHDW".toCharArray()) {
            System.out.println(c);
        }

        for (int i=0; i<"FHDW".length(); i++) {
            System.out.println("FHDW".charAt(i));
        }

        // "LAGERREGAL"
    }

}
