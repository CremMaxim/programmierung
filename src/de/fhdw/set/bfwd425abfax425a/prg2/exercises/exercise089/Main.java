package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise089;

public class Main {

    public static void main(String[] args) {
        Day day;

        day = Day.SUNDAY;
        for (Day d : Day.values()) {
            System.out.printf("%s (%s) %s\n",
               d, d.getAbbr(),
               d.isWeekendDay()?"ist ein Wochenendtag":"ist kein Wochenendtag");
        }
    }

}
