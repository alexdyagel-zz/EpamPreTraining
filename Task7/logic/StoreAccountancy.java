package by.epam.preTraining.alexdyagel.tasks.task07.logic;

import by.epam.preTraining.alexdyagel.tasks.task07.model.container.LimitedGadgetsStore;
import by.epam.preTraining.alexdyagel.tasks.task07.model.container.UnlimitedGadgetsStore;
import by.epam.preTraining.alexdyagel.tasks.task07.model.entity.Gadget;

/**
 * This class is for doing some accountancy
 * I don't understand for to get rid of duplicated code here
 */
public class StoreAccountancy {

    public static double getTotalCostOfGadgets(LimitedGadgetsStore store) {
        Gadget[] assortment = store.getGadgets();
        double totalCost = 0;
        for (int i = 0; i < store.getAmountOfGadgets(); i++) {
            totalCost += assortment[i].getPrice();
        }
        return totalCost;
    }

    public static double getTotalCostOfGadgets(UnlimitedGadgetsStore store) {
        Gadget[] assortment = store.getGadgets();
        double totalCost = 0;
        for (int i = 0; i < store.getAmountOfGadgets(); i++) {
            totalCost += assortment[i].getPrice();
        }
        return totalCost;
    }

    public static Gadget getCheapestGadget(LimitedGadgetsStore store) {
        Gadget[] assortment = store.getGadgets();
        if (assortment.length == 0) {
            return null;
        }
        Gadget cheapest = assortment[0];
        for (int i = 1; i < store.getAmountOfGadgets(); i++) {
            if (cheapest.getPrice() > assortment[i].getPrice()) {
                cheapest = assortment[i];
            }
        }
        return cheapest;
    }

    public static Gadget getCheapestGadget(UnlimitedGadgetsStore store) {
        Gadget[] assortment = store.getGadgets();
        if (assortment.length == 0) {
            return null;
        }
        Gadget cheapest = assortment[0];
        for (int i = 1; i < store.getAmountOfGadgets(); i++) {
            if (cheapest.getPrice() > assortment[i].getPrice()) {
                cheapest = assortment[i];
            }
        }
        return cheapest;
    }

    public static Gadget getMostExpensiveGadget(LimitedGadgetsStore store) {
        Gadget[] assortment = store.getGadgets();
        if (assortment.length == 0) {
            return null;
        }
        Gadget mostExpensive = assortment[0];
        for (int i = 1; i < store.getAmountOfGadgets(); i++) {
            if (mostExpensive.getPrice() < assortment[i].getPrice()) {
                mostExpensive = assortment[i];
            }
        }
        return mostExpensive;
    }

    public static Gadget getMostExpensiveGadget(UnlimitedGadgetsStore store) {
        Gadget[] assortment = store.getGadgets();
        if (assortment.length == 0) {
            return null;
        }
        Gadget mostExpensive = assortment[0];
        for (int i = 1; i < store.getAmountOfGadgets(); i++) {
            if (mostExpensive.getPrice() < assortment[i].getPrice()) {
                mostExpensive = assortment[i];
            }
        }
        return mostExpensive;
    }

    public static Gadget[] filterGadgetsByPrice(LimitedGadgetsStore store, double min, double max) {
        Gadget[] assortment = store.getGadgets();
        Gadget[] filteredAssortment = new Gadget[store.getMaxNumberOfGadgets()];
        int count = 0;
        for (int i = 0; i < store.getAmountOfGadgets(); i++) {
            if (assortment[i].getPrice() >= min && assortment[i].getPrice() <= max) {
                filteredAssortment[count] = assortment[i];
                count++;
            }
        }
        if (count == 0) {
            return null;
        } else {
            // create new array of gadgets for not to allocate redundant memory
            Gadget[] filteredArray = new Gadget[count];
            System.arraycopy(filteredAssortment, 0, filteredArray, 0, filteredArray.length);
            return filteredArray;
        }
    }

    public static Gadget[] filterGadgetsByPrice(UnlimitedGadgetsStore store, double min, double max) {
        Gadget[] assortment = store.getGadgets();
        Gadget[] filteredAssortment = new Gadget[store.getAmountOfGadgets()];
        int count = 0;
        for (int i = 0; i < store.getAmountOfGadgets(); i++) {
            if (assortment[i].getPrice() >= min && assortment[i].getPrice() <= max) {
                filteredAssortment[count] = assortment[i];
                count++;
            }
        }
        if (count == 0) {
            return null;
        } else {
            // create new array of gadgets for not to allocate redundant memory
            Gadget[] filteredArray = new Gadget[count];
            System.arraycopy(filteredAssortment, 0, filteredArray, 0, filteredArray.length);
            return filteredArray;
        }
    }
}
