package by.epam.preTraining.alexdyagel.tasks.task07.model.container;

import by.epam.preTraining.alexdyagel.tasks.task07.model.entity.Gadget;

import java.util.Arrays;

public class UnlimitedGadgetsStore {
    private String name;
    private Gadget[] gadgets;
    private int amountOfGadgets;

    public UnlimitedGadgetsStore() {
    }

    public UnlimitedGadgetsStore(String name, Gadget[] gadgets) {
        this.name = name;
        this.gadgets = gadgets;
        amountOfGadgets = gadgets.length;
    }

    public UnlimitedGadgetsStore(UnlimitedGadgetsStore store) {
        name = store.name;
        gadgets = store.gadgets;
        amountOfGadgets = store.amountOfGadgets;
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
        //amountOfGadgets = gadgets.length;
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
        if (!(object instanceof UnlimitedGadgetsStore)) {
            return false;
        }
        UnlimitedGadgetsStore that = (UnlimitedGadgetsStore) object;
        return Arrays.equals(getGadgets(), that.getGadgets())
                && getName().equals(that.getName())
                && getAmountOfGadgets() == that.getAmountOfGadgets();
    }

    @Override
    public int hashCode() {
        final int primeNumber1 = 17;
        final int primeNumber2 = 37;
        int result = primeNumber1;
        result = primeNumber2 * result + name.hashCode();
        result = primeNumber2 * result + amountOfGadgets;
        result = primeNumber2 * result + Arrays.hashCode(getGadgets());
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




