package de.fhdw.set.bfwd425abfax425a.prg2.lernen.enums;

public class Main {
    public static void main(String[] args) {

        // 1) values(): alle Zustände + ihren jeweiligen Nachfolger ausgeben
        System.out.println("--- Alle Zustände und ihr Nachfolger ---");
        for (TrafficLightState state : TrafficLightState.values()) {
            System.out.println(state + " -> " + state.getNextState());
        }

        // 2) Den Ampel-Zyklus durchlaufen (8 Schritte = zweimal rum)
        System.out.println("\n--- Zyklus ab RED ---");
        TrafficLightState current = TrafficLightState.RED;
        for (int i = 0; i < 8; i++) {
            System.out.println(current);
            current = current.getNextState();   // weiterschalten
        }

        // 3) valueOf(): aus einem String den passenden Enum-Wert holen
        System.out.println("\n--- valueOf ---");
        TrafficLightState fromText = TrafficLightState.valueOf("GREEN");
        System.out.println("valueOf(\"GREEN\") = " + fromText);
        System.out.println("Nachfolger davon = " + fromText.getNextState());
    }
}