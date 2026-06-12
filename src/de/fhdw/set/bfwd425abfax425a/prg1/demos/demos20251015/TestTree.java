package de.fhdw.set.bfwd425abfax425a.prg1.demos.demos20251015;

public class TestTree {

    public static void main(String[] args) {
        int height;

        height = 0;
        while (height<=10) {
            System.out.println("Baum der Höhe " + height + "\n");
            Tree.drawTree(height);
            System.out.println();
            height++;
        }

    }
}
