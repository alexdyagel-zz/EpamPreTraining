package by.epam.preTraining.alexdyagel.tasks.task07.businessLogic;

import by.epam.preTraining.alexdyagel.tasks.task07.entities.Gadget;

import java.util.Arrays;

public class GadgetsStore {
    private String name;
    private Gadget[] gadgets;
    private int amountOfGadgets;
    private static final int MAX_NUMBER_OF_GADGETS = 1000;

    public GadgetsStore() {
        amountOfGadgets = 0;
        gadgets = new Gadget[MAX_NUMBER_OF_GADGETS];
    }

    public GadgetsStore(String name, Gadget[] gadgets, int amountOfGadgets) {
        this.name = name;
        this.gadgets = gadgets;
        this.amountOfGadgets = amountOfGadgets;
    }

    public static int getMaxNumberOfGadgets() {
        return MAX_NUMBER_OF_GADGETS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gadget[] getGadgets() {
        return gadgets;
    }

    public void setGadgets(Gadget[] gadgets) {
        this.gadgets = gadgets;
    }

    public int getAmountOfGadgets() {
        return amountOfGadgets;
    }

    public void setAmountOfGadgets(int amountOfGadgets) {
        this.amountOfGadgets = amountOfGadgets;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof GadgetsStore)) {
            return false;
        }
        GadgetsStore that = (GadgetsStore) object;
        return Arrays.equals(getGadgets(), that.getGadgets());
    }

    @Override
    public int hashCode() {
        final int primeNumber1 = 17;
        final int primeNumber2 = 37;
        int result = primeNumber1;
        result = primeNumber2 * result + name.hashCode();
        result = primeNumber2 * result + amountOfGadgets;
        result = primeNumber2 * result + Arrays.hashCode(getGadgets());
        result = primeNumber2 * result + MAX_NUMBER_OF_GADGETS;
        return result;
    }

    @Override
    public String toString() {
        String res = "Store name : " + name + "\n Amount of gadgets: " + amountOfGadgets + "\n";
        for (int i = 0; i < getAmountOfGadgets(); i++) {
            res += gadgets[i].toString();
        }
        return res;
    }


}
