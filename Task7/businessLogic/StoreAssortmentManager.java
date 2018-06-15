package by.epam.preTraining.alexdyagel.tasks.task07.businessLogic;

import by.epam.preTraining.alexdyagel.tasks.task07.entities.Gadget;

public class StoreAssortmentManager {

    public StoreAssortmentManager() {
    }

    @Override
    public String toString() {
        return "StoreAssortmentManager";
    }

    public boolean add(GadgetsStore store, Gadget gadget) {
        if (store.getAmountOfGadgets() < GadgetsStore.getMaxNumberOfGadgets()) {
            Gadget[] assortment = store.getGadgets();
            assortment[store.getAmountOfGadgets()] = gadget;
            store.setAmountOfGadgets(store.getAmountOfGadgets() + 1);
            return true;
        }
        return false;
    }

    public boolean add(GadgetsStore store, Gadget[] gadgets) {
        if (store.getAmountOfGadgets() + gadgets.length <= GadgetsStore.getMaxNumberOfGadgets()) {
            Gadget[] assortment = store.getGadgets();
            for (int i = store.getAmountOfGadgets(), j = 0; i < store.getAmountOfGadgets() + gadgets.length; i++, j++) {
                assortment[i] = gadgets[j];
            }
            store.setAmountOfGadgets(store.getAmountOfGadgets() + gadgets.length);
            return true;
        }
        return false;
    }

    public int getNumberOfGadgets(GadgetsStore store) {
        return store.getAmountOfGadgets();
    }

    public boolean isAssortmentEmpty(GadgetsStore store) {
        return store.getAmountOfGadgets() == 0;
    }

    public Gadget getGadget(GadgetsStore store, int index) {
        if (index < 1 || index > store.getAmountOfGadgets()) {
            return null;
        } else {
            return store.getGadgets()[index - 1];
        }
    }

    public boolean removeGadget(GadgetsStore store, int index) {
        if (index < 1 || index > store.getAmountOfGadgets()) {
            return false;
        } else {
            Gadget[] assortment = store.getGadgets();
            for (int i = index - 1; i < store.getAmountOfGadgets(); i++) {
                assortment[i] = assortment[i + 1];
            }
            store.setAmountOfGadgets(store.getAmountOfGadgets() - 1);
            return true;
        }
    }

    public boolean removeAllGadgets(GadgetsStore store) {
        if (store.getAmountOfGadgets() != 0) {
            Gadget[] assortment = store.getGadgets();
            for (int i = 0; i < store.getAmountOfGadgets(); i++) {
                assortment[i] = null;
            }
            store.setAmountOfGadgets(0);
            return true;
        }
        return false;
    }

    public boolean contains(GadgetsStore store, Gadget gadget) {
        Gadget[] assortment = store.getGadgets();
        for (int i = 0; i < store.getAmountOfGadgets(); i++) {
            if (assortment[i].equals(gadget)) {
                return true;
            }
        }
        return false;
    }
}
