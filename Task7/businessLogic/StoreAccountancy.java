package by.epam.preTraining.alexdyagel.tasks.task07.businessLogic;

import by.epam.preTraining.alexdyagel.tasks.task07.entities.Gadget;

public class StoreAccountancy {
    public StoreAccountancy() {
    }

    @Override
    public String toString() {
        return "StoreAccountancy";
    }

    public double getTotalCostOfGadgets(GadgetsStore store) {
        Gadget[] assortment = store.getGadgets();
        double totalCost = 0;
        for (int i = 0; i < store.getAmountOfGadgets(); i++) {
            totalCost += assortment[i].getPrice();
        }
        return totalCost;
    }

    public Gadget getCheapestGadget(GadgetsStore store) {
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

    public Gadget getMostExpensiveGadget(GadgetsStore store) {
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

    public Gadget[] filterGadgetsByPrice(GadgetsStore store, double min, double max) {
        Gadget[] assortment = store.getGadgets();
        Gadget[] filteredAssortment = new Gadget[GadgetsStore.getMaxNumberOfGadgets()];
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
