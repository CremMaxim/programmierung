package de.fhdw.set.bfwd425abfax425a.prg1.exercises.exercise017;

public class PetersChocolate {

    static int getNumberOfChocolatesEatenByPeter(int money, int pricePerChocBar, int couponsNeededForChocBar) {
        int chocBarsEaten;
        int remainingCoupons;

        chocBarsEaten = getChocolateForMoney(money, pricePerChocBar);
        remainingCoupons = chocBarsEaten;
        while (remainingCoupons >= couponsNeededForChocBar) {
            remainingCoupons -= couponsNeededForChocBar;     // get 1 chocolate for coupons
            chocBarsEaten++;       // one new chocolate
            remainingCoupons++;    // one new coupon
        }
        return chocBarsEaten;
    }

    private static int getChocolateForMoney(int money, int pricePerChocBar) {
        return money / pricePerChocBar;
    }

}
