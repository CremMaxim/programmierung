package de.fhdw.set.bfwd425abfax425a.prg2.exercises.exercise085a;

public class Motorcycle extends Vehicle {

    private boolean mHasSideCar;

    Motorcycle(String brand, String model, double performance,
               int buildYear, boolean hasSideCar) {
        super(brand, model, performance, buildYear);
        setHasSideCar(hasSideCar);
    }

    public boolean hasSideCar() {
        return mHasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.mHasSideCar = hasSideCar;
    }

    @Override
    public String toString() {
        return String.format("Marke: %s\nModell: %s\nLeistung: %s\nBaujahr: %s\nBeiwagen vorhanden: %s\n",
                             getBrand(), getModel(), getPerformance(),
                             getBuildYear(), hasSideCar()?"ja":"nein");
    }

    @Override
    public boolean equals(Object obj) {
        Motorcycle c1, c2;

        if(!super.equals(obj)) {
            return false;
        }
        c1 = this;
        c2 = (Motorcycle) obj;
        return c1.hasSideCar() == c2.hasSideCar();
    }
    
}
