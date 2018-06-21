package by.epam.preTraining.alexdyagel.tasks.task07.logic;

import by.epam.preTraining.alexdyagel.tasks.task07.model.container.LimitedGadgetsStore;
import by.epam.preTraining.alexdyagel.tasks.task07.model.container.UnlimitedGadgetsStore;
import by.epam.preTraining.alexdyagel.tasks.task07.model.entity.Gadget;

public class StoreSorter {
    public static void sortByBubble(UnlimitedGadgetsStore store) {
        Gadget[] assortment = store.getGadgets();
        Gadget temp;
        int borderIn;
        int borderOut = assortment.length - 1;
        boolean flag = false;
        for (int i = 0; i < borderOut; i++) {
            borderIn = assortment.length - 1 - i;
            for (int j = 0; j < borderIn; j++) {
                if (assortment[j].getPrice() > assortment[j + 1].getPrice()) {
                    flag = true;
                    temp = assortment[j];
                    assortment[j] = assortment[j + 1];
                    assortment[j + 1] = temp;
                }
            }
            if (!flag) {
                return;
            }
        }
    }

    public static void sortWithInsertion(UnlimitedGadgetsStore store) {
        Gadget[] assortment = store.getGadgets();
        Gadget temp;
        for (int i = 1; i < assortment.length; i++) {
            for (int j = i; j > 0; j--) {
                if (assortment[j].getPrice() < assortment[j - 1].getPrice()) {
                    temp = assortment[j];
                    assortment[j] = assortment[j - 1];
                    assortment[j - 1] = temp;
                }
            }
        }
    }

    public static void sortWithSelection(UnlimitedGadgetsStore store) {
        Gadget[] assortment = store.getGadgets();
        Gadget temp;
        double max;
        int maxInd;
        for (int i = assortment.length - 1; i > 0; i--) {
            max = assortment[0].getPrice();
            maxInd = 0;
            for (int j = 1; j <= i; j++) {
                if (assortment[j].getPrice() > max) {
                    max = assortment[j].getPrice();
                    maxInd = j;
                }
            }
            if (i != maxInd) {
                temp = assortment[maxInd];
                assortment[maxInd] = assortment[i];
                assortment[i] = temp;
            }
        }
    }
}
