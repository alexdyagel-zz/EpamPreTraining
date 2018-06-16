package by.epam.preTraining.alexdyagel.tasks.task07.model.entity;

public abstract class Gadget {
    private String brand;
    private String model;
    private double price;
    private double screenSize;

    public Gadget() {
    }

    public Gadget(String brand, String model, double price, double screenSize) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.screenSize = screenSize;
    }

    public Gadget(Gadget gadget) {
        brand = gadget.brand;
        model = gadget.model;
        price = gadget.price;
        screenSize = gadget.screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Gadget gadget = (Gadget) object;
        return getPrice() == gadget.getPrice()
                && getScreenSize() == gadget.getScreenSize()
                && getBrand().equals(gadget.getBrand())
                && getModel().equals(gadget.getModel());
    }

    @Override
    public int hashCode() {
        final int primeNumber1 = 17;
        final int primeNumber2 = 37;
        int result = primeNumber1;
        long priceL = Double.doubleToLongBits(getPrice());
        long screenSizeL = Double.doubleToLongBits(getScreenSize());
        result = primeNumber2 * result + (getBrand() == null ? 0 : getBrand().hashCode());
        result = primeNumber2 * result + (getModel() == null ? 0 : getModel().hashCode());
        result = primeNumber2 * result + (int) (priceL - (priceL >>> 32));
        result = primeNumber2 * result + (int) (screenSizeL - (screenSizeL >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return " brand: " + brand + "\n"
                + " model: " + model + "\n"
                + " price: " + price + "\n"
                + " screenSize: " + screenSize + '\n';
    }
}
