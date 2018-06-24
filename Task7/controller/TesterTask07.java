package by.epam.preTraining.alexdyagel.tasks.task07.controller;

import by.epam.preTraining.alexdyagel.tasks.task07.logic.StoreSorter;
import by.epam.preTraining.alexdyagel.tasks.task07.model.container.LimitedGadgetsStore;
import by.epam.preTraining.alexdyagel.tasks.task07.logic.StoreAccountancy;
import by.epam.preTraining.alexdyagel.tasks.task07.logic.StoreManager;
import by.epam.preTraining.alexdyagel.tasks.task07.model.container.UnlimitedGadgetsStore;
import by.epam.preTraining.alexdyagel.tasks.task07.view.ConsoleView;

import java.util.Arrays;


public class TesterTask07 {

    public static void main(String[] args) {
        System.out.println("\n****************Limited Store****************");

        int number = 5;
        int maxNumberOfGadgets = 300;
        String name = "iStore";
        LimitedGadgetsStore store = AppleStoreCreator.createStore(number, name,maxNumberOfGadgets );
        ConsoleView.print(store);
        ConsoleView.print("Assortment of iStore empty  ==> " + StoreManager.isAssortmentEmpty(store));

        if (!StoreManager.isAssortmentEmpty(store)) {
            ConsoleView.print("Amount of gadgets in Store -- " + StoreManager.getNumberOfGadgets(store));
        } else ConsoleView.print("Assortment of Store empty ");

        // get gadgets by their indexes
        ConsoleView.print("\nGadget with index 8 :\n" + StoreManager.getGadget(store, 8));
        ConsoleView.print("\nGadget with index 9 :\n" + StoreManager.getGadget(store, 9));

        //deleting gadgets by their indexes
        int ind = 2;
        ConsoleView.print("\nDelete gadget with index " + ind + "\n");
        if (StoreManager.removeGadget(store, ind)) {
            ConsoleView.print(store);
        } else {
            ConsoleView.print("Wrong index\n");
        }

        //find out the cheapest and the most expensive gadget and general cost of gadgets in store
        ConsoleView.print("\nThe cheapest gadget: \n" + StoreAccountancy.getCheapestGadget(store));
        ConsoleView.print("\nThe most expensive gadget: \n" + StoreAccountancy.getMostExpensiveGadget(store));
        ConsoleView.print("\nGeneral cost of all gadgets in the store($): " + StoreAccountancy.getTotalCostOfGadgets(store));

        //find out gadgets in the entered range of prices
        double minPrice = 400;
        double maxPrice = 800;
        System.out.printf("Gadgets from %.1f to %.1f $\n", minPrice, maxPrice);
        ConsoleView.print(Arrays.toString(StoreAccountancy.filterGadgetsByPrice(store, minPrice, maxPrice)));

        //remove all assortment from the store
        System.out.println("\nAssortment after removing all gadgets from store :");
        StoreManager.removeAllGadgets(store);
        ConsoleView.print(store);

        System.out.println("\n****************Unlimited Store****************");

        number = 10;
        name = "XiStore";
        UnlimitedGadgetsStore store1 = XiaomiStoreCreator.createStore(number, name);
        ConsoleView.print(store1);

        ConsoleView.print("Assortment of iStore empty  ==> " + StoreManager.isAssortmentEmpty(store1));

        if (!StoreManager.isAssortmentEmpty(store1)) {
            ConsoleView.print("Amount of gadgets in Store -- " + StoreManager.getNumberOfGadgets(store));
        } else ConsoleView.print("Assortment of Store empty ");

        // get gadgets by their indexes
        ConsoleView.print("\nGadget with index 8 :\n" + StoreManager.getGadget(store1, 8));
        ConsoleView.print("\nGadget with index 9 :\n" + StoreManager.getGadget(store1, 9));

        //deleting gadgets by their indexes
        ind = 2;
        ConsoleView.print("\nDelete gadget with index " + ind + "\n");
        if (StoreManager.removeGadget(store1, ind)) {
            ConsoleView.print(store1);
        } else {
            ConsoleView.print("Wrong index\n");
        }

        //find out the cheapest and the most expensive gadget and general cost of gadgets in store
        ConsoleView.print("\nThe cheapest gadget: \n" + StoreAccountancy.getCheapestGadget(store1));
        ConsoleView.print("\nThe most expensive gadget: \n" + StoreAccountancy.getMostExpensiveGadget(store1));
        ConsoleView.print("\nGeneral cost of all gadgets in the store($): " + StoreAccountancy.getTotalCostOfGadgets(store1));

        //find out gadgets in the entered range of prices
         minPrice = 10;
         maxPrice = 500;
        System.out.printf("Gadgets from %.1f to %.1f $\n", minPrice, maxPrice);
        ConsoleView.print(Arrays.toString(StoreAccountancy.filterGadgetsByPrice(store1, minPrice, maxPrice)));

        //remove all assortment from the store
        System.out.println("\nAssortment after removing all gadgets from store :");
        StoreManager.removeAllGadgets(store1);
        ConsoleView.print(store1);

        ConsoleView.print("********DEMONSTRATING SORTING ALGORITHMS:");

        UnlimitedGadgetsStore store2 = XiaomiStoreCreator.createStore(20, "Xiaomi store 2");
        ConsoleView.print(store2);
        StoreSorter.sortByBubble(store2);
        ConsoleView.print("\nStore with sorted assortment :");
        ConsoleView.print(store2);

        UnlimitedGadgetsStore store3 = XiaomiStoreCreator.createStore(20, "Xiaomi store 3");
        ConsoleView.print(store3);
        StoreSorter.sortWithInsertion(store3);
        ConsoleView.print("\nStore with sorted assortment :");
        ConsoleView.print(store3);

        UnlimitedGadgetsStore store4 = XiaomiStoreCreator.createStore(20, "Xiaomi store 4");
        ConsoleView.print(store4);
        StoreSorter.sortWithSelection(store4);
        ConsoleView.print("\nStore with sorted assortment :");
        ConsoleView.print(store4);

        UnlimitedGadgetsStore store5 = XiaomiStoreCreator.createStore(20, "Xiaomi store 5");
        ConsoleView.print(store5);
        StoreSorter.sortWithSelection(store5);
        ConsoleView.print("\nStore with sorted assortment :");
        ConsoleView.print(store5);
    }
}
