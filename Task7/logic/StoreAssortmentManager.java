package by.epam.preTraining.alexdyagel.tasks.task07.logic;

import by.epam.preTraining.alexdyagel.tasks.task07.model.container.GadgetsStore;
import by.epam.preTraining.alexdyagel.tasks.task07.model.entity.Gadget;

/**
 * This class manages Gadgets Store
 */
public class StoreAssortmentManager {

    public static boolean add(GadgetsStore store, Gadget gadget) {
        if (store.getAmountOfGadgets() < GadgetsStore.getMaxNumberOfGadgets()) {
            Gadget[] assortment = store.getGadgets();
            assortment[store.getAmountOfGadgets()] = gadget;
            store.setAmountOfGadgets(store.getAmountOfGadgets() + 1);
            return true;
        }
        return false;
    }

    public static boolean add(GadgetsStore store, Gadget[] gadgets) {
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

    public static int getNumberOfGadgets(GadgetsStore store) {
        return store.getAmountOfGadgets();
    }

    public static boolean isAssortmentEmpty(GadgetsStore store) {
        return store.getAmountOfGadgets() == 0;
    }

    public static Gadget getGadget(GadgetsStore store, int index) {
        if (index < 1 || index > store.getAmountOfGadgets()) {
            return null;
        } else {
            return store.getGadgets()[index - 1];
        }
    }

    public static boolean removeGadget(GadgetsStore store, int index) {
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

    public static boolean removeAllGadgets(GadgetsStore store) {
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

    public static boolean contains(GadgetsStore store, Gadget gadget) {
        Gadget[] assortment = store.getGadgets();
        for (int i = 0; i < store.getAmountOfGadgets(); i++) {
            if (assortment[i].equals(gadget)) {
                return true;
            }
        }
        return false;
    }
}
