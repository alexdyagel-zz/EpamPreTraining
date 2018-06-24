package by.epam.preTraining.alexdyagel.tasks.task07.logic;

import by.epam.preTraining.alexdyagel.tasks.task07.model.container.LimitedGadgetsStore;
import by.epam.preTraining.alexdyagel.tasks.task07.model.container.UnlimitedGadgetsStore;
import by.epam.preTraining.alexdyagel.tasks.task07.model.entity.Gadget;

/**
 * This class manages Gadgets Store
 */
public class StoreManager {

    public static boolean add(LimitedGadgetsStore store, Gadget gadget) {
        if (store.getAmountOfGadgets() < store.getMaxNumberOfGadgets()) {
            Gadget[] assortment = store.getGadgets();
            assortment[store.getAmountOfGadgets()] = gadget;
            store.setAmountOfGadgets(store.getAmountOfGadgets() + 1);
            return true;
        }
        return false;
    }

    public static boolean add(UnlimitedGadgetsStore store, Gadget gadget) {
        Gadget[] assortment = store.getGadgets();
        Gadget[] updatedAssortment = new Gadget[store.getAmountOfGadgets() + 1];
        if (assortment != null) {
            System.arraycopy(assortment, 0, updatedAssortment, 0, store.getAmountOfGadgets());
        }
        updatedAssortment[store.getAmountOfGadgets()] = gadget;
        store.setGadgets(updatedAssortment);
        store.setAmountOfGadgets(updatedAssortment.length);
        return true;
    }

    public static boolean add(LimitedGadgetsStore store, Gadget[] gadgets) {
        if (store.getAmountOfGadgets() + gadgets.length <= store.getMaxNumberOfGadgets()) {
            Gadget[] assortment = store.getGadgets();
            for (int i = store.getAmountOfGadgets(), j = 0; i < store.getAmountOfGadgets() + gadgets.length; i++, j++) {
                assortment[i] = gadgets[j];
            }
            store.setAmountOfGadgets(store.getAmountOfGadgets() + gadgets.length);
            return true;
        }
        return false;
    }

    public static boolean add(UnlimitedGadgetsStore store, Gadget[] gadgets) {
        Gadget[] assortment = store.getGadgets();
        Gadget[] updatedAssortment = new Gadget[store.getAmountOfGadgets() + gadgets.length];
        System.arraycopy(assortment, 0, updatedAssortment, 0, store.getAmountOfGadgets());
        for (int i = store.getAmountOfGadgets(), j = 0; i < assortment.length; i++, j++) {
            assortment[i] = gadgets[j];
        }
        store.setGadgets(updatedAssortment);
        store.setAmountOfGadgets(updatedAssortment.length);
        return true;
    }

    public static int getNumberOfGadgets(LimitedGadgetsStore store) {
        return store.getAmountOfGadgets();
    }

    public static int getNumberOfGadgets(UnlimitedGadgetsStore store) {
        return store.getAmountOfGadgets();
    }

    public static boolean isAssortmentEmpty(LimitedGadgetsStore store) {
        return store.getAmountOfGadgets() == 0;
    }

    public static boolean isAssortmentEmpty(UnlimitedGadgetsStore store) {
        return store.getAmountOfGadgets() == 0;
    }

    public static Gadget getGadget(LimitedGadgetsStore store, int index) {
        if (index < 1 || index > store.getAmountOfGadgets()) {
            return null;
        } else {
            Gadget[] assortment = store.getGadgets();
            return assortment[index - 1];
        }
    }

    public static Gadget getGadget(UnlimitedGadgetsStore store, int index) {
        if (index < 1 || index > store.getAmountOfGadgets()) {
            return null;
        } else {
            Gadget[] assortment = store.getGadgets();
            return assortment[index - 1];
        }
    }

    public static boolean removeGadget(LimitedGadgetsStore store, int index) {
        if (index < 1 || index > store.getAmountOfGadgets()) {
            return false;
        } else {
            Gadget[] assortment = store.getGadgets();
            for (int i = index - 1; i < store.getAmountOfGadgets(); i++) {
                assortment[i] = assortment[i + 1];
            }
            assortment[store.getAmountOfGadgets()] = null;
            store.setAmountOfGadgets(store.getAmountOfGadgets() - 1);
            return true;
        }
    }

    public static boolean removeGadget(UnlimitedGadgetsStore store, int index) {
        if (index < 1 || index > store.getAmountOfGadgets()) {
            return false;
        } else {
            Gadget[] assortment = store.getGadgets();
            Gadget[] updatedAssortment = new Gadget[store.getAmountOfGadgets() - 1];
            System.arraycopy(assortment, 0, updatedAssortment, 0, index - 1);
            System.arraycopy(assortment, index, updatedAssortment, index - 1, assortment.length - index);
            store.setGadgets(updatedAssortment);
            store.setAmountOfGadgets(updatedAssortment.length);
            return true;
        }
    }

    public static boolean removeAllGadgets(LimitedGadgetsStore store) {
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


    public static boolean removeAllGadgets(UnlimitedGadgetsStore store) {
        if (store.getAmountOfGadgets() != 0) {
            Gadget[] assortment = new Gadget[0];
            store.setGadgets(assortment);
            store.setAmountOfGadgets(0);
            return true;
        }
        return false;
    }

    public static boolean contains(LimitedGadgetsStore store, Gadget gadget) {
        Gadget[] assortment = store.getGadgets();
        for (int i = 0; i < store.getAmountOfGadgets(); i++) {
            if (assortment[i].equals(gadget)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(UnlimitedGadgetsStore store, Gadget gadget) {
        Gadget[] assortment = store.getGadgets();
        for (int i = 0; i < store.getAmountOfGadgets(); i++) {
            if (assortment[i].equals(gadget)) {
                return true;
            }
        }
        return false;
    }
}
