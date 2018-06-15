package by.epam.preTraining.alexdyagel.tasks.task07.entities;

import java.util.Objects;

public class Tablet extends Gadget {
    private boolean stylus;

    public Tablet() {
    }

    public Tablet(String brand, String model, double price, double screenSize, boolean stylus) {
        super(brand, model, price, screenSize);
        this.stylus = stylus;
    }

    public Tablet(Tablet tablet) {
        super(tablet.getBrand(), tablet.getModel(), tablet.getPrice(), tablet.getScreenSize());
        stylus = tablet.stylus;
    }

    public boolean hasStylus() {
        return stylus;
    }

    public void setStylus(boolean stylus) {
        this.stylus = stylus;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Tablet)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        Tablet tablet = (Tablet) object;
        return hasStylus() == tablet.hasStylus();
    }

    @Override
    public int hashCode() {
        final int primeNumber1 = 17;
        final int primeNumber2 = 37;
        int result = primeNumber1;
        result = primeNumber2 * result + super.hashCode();
        result = primeNumber2 * result + (hasStylus() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Tablet" + "\n"
                + super.toString()
                + " stylus: " + stylus + "\n";
    }
}
