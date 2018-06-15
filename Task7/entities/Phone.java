package by.epam.preTraining.alexdyagel.tasks.task07.entities;

public class Phone extends Gadget {
    private boolean fingerprintScanner;

    public Phone() {
    }

    public Phone(String brand, String model, double price, double screenSize, boolean fingerprintScanner) {
        super(brand, model, price, screenSize);
        this.fingerprintScanner = fingerprintScanner;
    }

    public Phone(Phone phone) {
        super(phone.getBrand(), phone.getModel(), phone.getPrice(), phone.getScreenSize());
        fingerprintScanner = phone.fingerprintScanner;
    }

    public boolean hasFingerprintScanner() {
        return fingerprintScanner;
    }

    public void setFingerprintScanner(boolean fingerprintScanner) {
        this.fingerprintScanner = fingerprintScanner;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Phone)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        Phone phone = (Phone) object;
        return hasFingerprintScanner() == phone.hasFingerprintScanner();
    }

    @Override
    public int hashCode() {
        final int primeNumber1 = 17;
        final int primeNumber2 = 37;
        int result = primeNumber1;
        result = primeNumber2 * result + super.hashCode();
        result = primeNumber2 * result + (hasFingerprintScanner() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return  "Phone" + "\n"
                + super.toString()
                + " fingerprintScanner: " + fingerprintScanner + "\n";
    }
}
