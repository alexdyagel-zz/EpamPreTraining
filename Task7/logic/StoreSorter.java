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
            temp = assortment[maxInd];
            assortment[maxInd] = assortment[i];
            assortment[i] = temp;
        }
    }

    public static void mergeSort(UnlimitedGadgetsStore store) {
        Gadget[] assortment = store.getGadgets();
        if (assortment.length == 1) {
            return;
        }
        int mid = assortment.length / 2;
        Gadget[] tempAssort1 = new Gadget[mid];
        Gadget[] tempAssort2 = new Gadget[assortment.length - mid];

        System.arraycopy(assortment, 0, tempAssort1, 0, mid);
        System.arraycopy(assortment, mid, tempAssort2, 0, assortment.length - mid);

        UnlimitedGadgetsStore tempStore1 = new UnlimitedGadgetsStore("Temp Store", tempAssort1);
        UnlimitedGadgetsStore tempStore2 = new UnlimitedGadgetsStore("Temp Store", tempAssort2);

        mergeSort(tempStore1);
        mergeSort(tempStore2);

        merge(assortment, tempAssort1, tempAssort2);
    }

    private static void merge(Gadget[] assortment, Gadget[] tempAssort1, Gadget[] tempAssort2) {
        int j = 0, k = 0, t = 0;
        while (j < tempAssort1.length && k < tempAssort2.length) {
            if (tempAssort1[j].getPrice() < tempAssort2[k].getPrice()) {
                assortment[t++] = tempAssort1[j++];
            } else {
                assortment[t++] = tempAssort2[k++];
            }
        }
        while (j < tempAssort1.length) {
            assortment[t++] = tempAssort1[j++];
        }
        while (k < tempAssort2.length) {
            assortment[t++] = tempAssort2[k++];
        }
    }
}
