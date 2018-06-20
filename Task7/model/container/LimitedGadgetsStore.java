package by.epam.preTraining.alexdyagel.tasks.task07.model.container;

import by.epam.preTraining.alexdyagel.tasks.task07.model.entity.Gadget;

import java.util.Arrays;


/**
 * This class is a static container for gadgets it should be limited with max number of gadgets
 */
public class LimitedGadgetsStore {
    private String name;
    private Gadget[] gadgets;
    private int amountOfGadgets;
    private int maxNumberOfGadgets;

    private static final int DEFAULT_MAX_NUMBER_OF_GADGETS = 1000;

    public LimitedGadgetsStore() {
        amountOfGadgets = 0;
        maxNumberOfGadgets = DEFAULT_MAX_NUMBER_OF_GADGETS;
        gadgets = new Gadget[maxNumberOfGadgets];
    }

    public LimitedGadgetsStore(String name, int maxNumberOfGadgets) {
        this.name = name;
        this.maxNumberOfGadgets = maxNumberOfGadgets;
        gadgets = new Gadget[this.maxNumberOfGadgets];
    }

    public LimitedGadgetsStore(String name, Gadget[] gadgets, int maxNumberOfGadgets) {
        this.name = name;
        this.gadgets = gadgets;
        this.amountOfGadgets = gadgets.length;
        this.maxNumberOfGadgets = maxNumberOfGadgets;
    }

    public LimitedGadgetsStore(LimitedGadgetsStore store) {
        name = store.name;
        gadgets = store.gadgets;
        amountOfGadgets = store.amountOfGadgets;
        maxNumberOfGadgets = store.maxNumberOfGadgets;
    }

    public int getMaxNumberOfGadgets() {
        return maxNumberOfGadgets;
    }

    public void setMaxNumberOfGadgets(int maxNumberOfGadgets) {
        this.maxNumberOfGadgets = maxNumberOfGadgets;
        gadgets = new Gadget[maxNumberOfGadgets];
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
        if (!(object instanceof LimitedGadgetsStore)) {
            return false;
        }
        LimitedGadgetsStore that = (LimitedGadgetsStore) object;
        return Arrays.equals(getGadgets(), that.getGadgets())
                && getName().equals(that.getName())
                && getAmountOfGadgets() == that.getAmountOfGadgets()
                && getMaxNumberOfGadgets() == that.getMaxNumberOfGadgets();
    }

    @Override
    public int hashCode() {
        final int primeNumber1 = 17;
        final int primeNumber2 = 37;
        int result = primeNumber1;
        result = primeNumber2 * result + name.hashCode();
        result = primeNumber2 * result + amountOfGadgets;
        result = primeNumber2 * result + Arrays.hashCode(getGadgets());
        result = primeNumber2 * result + maxNumberOfGadgets;
        return result;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("Store name : " + name + "\n Amount of gadgets: " + amountOfGadgets + "\n");
        for (int i = 0; i < getAmountOfGadgets(); i++) {
            res.append(gadgets[i].toString());
        }
        return res.toString();
    }


}
