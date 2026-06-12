package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise077;

public class TestPascalsTriangle {

    public static void main(String[] args) {
        int[][] result;

        result = PascalsTriangle.pascalsTriangle(15);
        ArrayUtils.print2DArray(result);
        // ArrayUtils.printPascalsTriangleNicely(result);
    }

}
