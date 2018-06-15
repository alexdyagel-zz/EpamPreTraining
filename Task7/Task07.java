package by.epam.preTraining.alexdyagel.tasks.task07;

import by.epam.preTraining.alexdyagel.tasks.task07.businessLogic.GadgetsStore;
import by.epam.preTraining.alexdyagel.tasks.task07.businessLogic.StoreAccountancy;
import by.epam.preTraining.alexdyagel.tasks.task07.businessLogic.StoreAssortmentManager;
import by.epam.preTraining.alexdyagel.tasks.task07.entities.*;
import by.epam.preTraining.alexdyagel.tasks.task07.util.View;

import java.util.Arrays;


public class Task07 {

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Apple", "MacBook Pro", 2500.0, 13.3, false);
        Phone phone = new Phone("Apple", "iphone X", 1500, 5.8, true);
        Tablet tablet = new Tablet("Apple", "iPad Pro", 800, 12.9, false);
        Watch watch = new Watch("Apple", "Watch Series 3", 500, 3, true);
        Gadget[] iPhoneXConsignment = {phone, phone, phone, phone, phone};
        GadgetsStore store = new GadgetsStore();
        store.setName("iStore");
        StoreAssortmentManager assortment = new StoreAssortmentManager();
        StoreAccountancy accountancy = new StoreAccountancy();

        View.print("Assortment of iStore empty  ==> " + assortment.isAssortmentEmpty(store));
        // adding gadgets to store
        assortment.add(store, laptop);
        assortment.add(store, tablet);
        assortment.add(store, watch);
        assortment.add(store, iPhoneXConsignment);
        View.print(store);
        if (!assortment.isAssortmentEmpty(store)) {
            View.print("Amount of gadgets in iStore -- " + assortment.getNumberOfGadgets(store));
        } else View.print("Assortment of iStore empty ");

        // get gadgets by their indexes
        View.print("\nGadget with index 8 :\n" + assortment.getGadget(store, 8));
        View.print("\nGadget with index 9 :\n" + assortment.getGadget(store, 9));

        //deleting gadgets by their indexes
        int ind = 2;
        View.print("\nDelete gadget with index " + ind + "\n");
        if (assortment.removeGadget(store, ind)) {
            View.print(store);
        } else {
            View.print("Wrong index\n");
        }

        //check whether store contains gadget
        View.print("Check, whether this gadget in stock");
        View.print(laptop);
        if (assortment.contains(store, laptop)) {
            View.print("Store has this gadget in stock");
        } else {
            View.print("There is no this gadget in stock");
        }

        //find out the cheapest and the most expensive gadget and general cost of gadgets in store
        View.print("\nThe cheapest gadget: \n" + accountancy.getCheapestGadget(store));
        View.print("\nThe most expensive gadget: \n" + accountancy.getMostExpensiveGadget(store));
        View.print("\nGeneral cost of all gadgets in the store($): " + accountancy.getTotalCostOfGadgets(store));

        //find out gadgets in the entered range of prices
        double minPrice = 850;
        double maxPrice = 2600;
        System.out.printf("Gadgets from %.1f to %.1f $\n", minPrice, maxPrice);
        View.print(Arrays.toString(accountancy.filterGadgetsByPrice(store, minPrice, maxPrice)));

        //remove all assortment from the store
        System.out.println("\nAssortment after removing all gadgets from store :");
        assortment.removeAllGadgets(store);
        View.print(store);
    }


}
