package by.epam.preTraining.alexdyagel.tasks.task07.entities;

public class Laptop extends Gadget {
    private boolean touchScreen;

    public Laptop() {
    }

    public Laptop(String brand, String model, double price, double screenSize, boolean touchScreen) {
        super(brand, model, price, screenSize);
        this.touchScreen = touchScreen;
    }

    public Laptop(Laptop laptop) {
        super(laptop.getBrand(), laptop.getModel(), laptop.getPrice(), laptop.getScreenSize());
        touchScreen = laptop.touchScreen;
    }

    public boolean hasTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Laptop)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        Laptop laptop = (Laptop) object;
        return hasTouchScreen() == laptop.hasTouchScreen();
    }

    @Override
    public int hashCode() {
        final int primeNumber1 = 17;
        final int primeNumber2 = 37;
        int result = primeNumber1;
        result = primeNumber2 * result + super.hashCode();
        result = primeNumber2 * result + (hasTouchScreen() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Laptop" + "\n"
                + super.toString()
                + " touchScreen: " + touchScreen + "\n";
    }
}
