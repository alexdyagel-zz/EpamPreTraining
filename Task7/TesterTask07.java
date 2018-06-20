package by.epam.preTraining.alexdyagel.tasks.task07;

import by.epam.preTraining.alexdyagel.tasks.task07.controller.AppleStoreCreator;
import by.epam.preTraining.alexdyagel.tasks.task07.model.container.LimitedGadgetsStore;
import by.epam.preTraining.alexdyagel.tasks.task07.logic.StoreAccountancy;
import by.epam.preTraining.alexdyagel.tasks.task07.logic.StoreManager;
import by.epam.preTraining.alexdyagel.tasks.task07.view.ConsoleView;

import java.util.Arrays;


public class TesterTask07 {

    public static void main(String[] args) {
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
        //Gadget g = new Gadget();
    }


}
