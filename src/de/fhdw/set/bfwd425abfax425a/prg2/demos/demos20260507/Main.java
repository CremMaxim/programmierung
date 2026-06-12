package de.fhdw.set.bfwd425abfax425a.prg2.demos.demos20260507;

public class Main {

    public static void main(String[] args) {
        Color color;

        color = Color.GREEN;
        System.out.println(Color.GREEN.getAbbr());
        switch(color) {
            case RED:
                System.out.println(Color.RED.getAbbr());
                break;
            case GREEN:
                System.out.println(Color.GREEN.getAbbr());
                break;
            case BLUE:
                System.out.println(Color.BLUE.getAbbr());
                break;
        }
        for (Color c : Color.values()) {
            System.out.println(c);
        }
        String[] allColorStrings = {"RED", "GREEN", "BLUE"};
        for (String strColor : allColorStrings) {
            System.out.println(Color.valueOf(strColor).getAbbr());
        }

    }
}
