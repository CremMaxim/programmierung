package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise017;

public class TestPetersChocolate {

    public static void main(String[] args) {
        int money, pricePerChocBar, couponsNeededForChockBar;
        int chocBarsEaten;

        money = 10;
        pricePerChocBar = 2;
        couponsNeededForChockBar = 5;
        chocBarsEaten = PetersChocolate.getNumberOfChocolatesEatenByPeter(money, pricePerChocBar, couponsNeededForChockBar);
        System.out.println(chocBarsEaten);   // 6

        money = 12;
        pricePerChocBar = 4;
        couponsNeededForChockBar = 4;
        chocBarsEaten = PetersChocolate.getNumberOfChocolatesEatenByPeter(money, pricePerChocBar, couponsNeededForChockBar);
        System.out.println(chocBarsEaten);   // 3

        money = 12;
        pricePerChocBar = 4;
        couponsNeededForChockBar = 2;
        chocBarsEaten = PetersChocolate.getNumberOfChocolatesEatenByPeter(money, pricePerChocBar, couponsNeededForChockBar);
        System.out.println(chocBarsEaten);   // 5

        money = 6;
        pricePerChocBar = 2;
        couponsNeededForChockBar = 2;
        chocBarsEaten = PetersChocolate.getNumberOfChocolatesEatenByPeter(money, pricePerChocBar, couponsNeededForChockBar);
        System.out.println(chocBarsEaten);   // 5

        money = 1;
        pricePerChocBar = 5;
        couponsNeededForChockBar = 2;
        chocBarsEaten = PetersChocolate.getNumberOfChocolatesEatenByPeter(money, pricePerChocBar, couponsNeededForChockBar);
        System.out.println(chocBarsEaten);   // 0

        money = 90;
        pricePerChocBar = 5;
        couponsNeededForChockBar = 5;
        chocBarsEaten = PetersChocolate.getNumberOfChocolatesEatenByPeter(money, pricePerChocBar, couponsNeededForChockBar);
        System.out.println(chocBarsEaten);   // 22

        money = 20;
        pricePerChocBar = 2;
        couponsNeededForChockBar = 2;
        chocBarsEaten = PetersChocolate.getNumberOfChocolatesEatenByPeter(money, pricePerChocBar, couponsNeededForChockBar);
        System.out.println(chocBarsEaten);   // 19
    }
}
