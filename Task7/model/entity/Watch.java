package by.epam.preTraining.alexdyagel.tasks.task07.model.entity;

public class Watch extends Gadget {
    private boolean pulsometer;

    public Watch() {
    }

    public Watch(String brand, String model, double price, double screenSize, boolean pulsometer) {
        super(brand, model, price, screenSize);
        this.pulsometer = pulsometer;
    }

    public Watch(Watch watch) {
        super(watch.getBrand(), watch.getModel(), watch.getPrice(), watch.getScreenSize());
        pulsometer = watch.pulsometer;
    }

    public boolean hasPulsometer() {
        return pulsometer;
    }

    public void setPulsometer(boolean pulsometer) {
        this.pulsometer = pulsometer;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Watch)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        Watch watch = (Watch) object;
        return hasPulsometer() == watch.hasPulsometer();
    }

    @Override
    public int hashCode() {
        final int primeNumber1 = 17;
        final int primeNumber2 = 37;
        int result = primeNumber1;
        result = primeNumber2 * result + super.hashCode();
        result = primeNumber2 * result + (hasPulsometer() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Watch" + "\n"
                + super.toString()
                + " pulsometer: " + pulsometer + "\n";
    }
}
