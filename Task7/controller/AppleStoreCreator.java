package by.epam.preTraining.alexdyagel.tasks.task07.controller;

import by.epam.preTraining.alexdyagel.tasks.task07.logic.StoreAssortmentManager;
import by.epam.preTraining.alexdyagel.tasks.task07.model.container.GadgetsStore;
import by.epam.preTraining.alexdyagel.tasks.task07.model.entity.*;

import java.util.Random;

/**
 * This class helps user to create store of Apple gadgets, filling it with random devices
 */
public class AppleStoreCreator {

    private static final String BRAND = "Apple";
    private static final int NUMBER_OF_GADGETS = 4;
    private static final int NUMBER_OF_MODELS = 3;

    private static final String[] LAPTOPS = {"MacBook", "MacBook Air", "MacBook Pro"};
    private static final double[] LAPTOP_PRICES = {1250, 2500, 3000};
    private static final double[] LAPTOP_SIZES = {13, 15, 17};
    private static final boolean TOUCHSCREEN = false;


    private static final String[] PHONES = {"iPhone X", "iPhone 8", "iPhone 7"};
    private static final double[] PHONE_PRICES = {1150, 800, 700};
    private static final double[] PHONE_SIZES = {5.8, 4.7, 4.7};
    private static final boolean FINGERPRINT = true;

    private static final String[] WATCHES = {"Watch Series 1", "Watch Series 2", "Watch Series 3"};
    private static final double[] WATCH_PRICES = {300, 350, 450};
    private static final double[] WATCH_SIZES = {2.9, 3.2, 3.2};
    private static final boolean PULSOMETER = true;

    private static final String[] TABLETS = {"iPad Pro", "iPad", "iPad mini"};
    private static final double[] TABLET_PRICES = {750, 400, 350};
    private static final double[] TABLET_SIZES = {10.5, 9.7, 7.9};
    private static final boolean[] STYLUS = {true, true, false};


    public static GadgetsStore createStore(int numberOfGadgets, String storeName, int maxNumberOfGadgets) {
        if (numberOfGadgets > maxNumberOfGadgets) {
            return null;
        }
        Random random = new Random(System.currentTimeMillis());
        GadgetsStore store = new GadgetsStore();
        store.setName(storeName);
        store.setMaxNumberOfGadgets(maxNumberOfGadgets);
        int gadgetNumber;
        for (int i = 0; i < numberOfGadgets; i++) {
            gadgetNumber = random.nextInt(NUMBER_OF_GADGETS);
            switch (gadgetNumber) {
                case 0:
                    StoreAssortmentManager.add(store, createLaptop());
                    break;
                case 1:
                    StoreAssortmentManager.add(store, createWatch());
                    break;
                case 2:
                    StoreAssortmentManager.add(store, createTablet());
                    break;
                case 3:
                    StoreAssortmentManager.add(store, createPhone());
                    break;
            }
        }
        return store;
    }

    public static Laptop createLaptop() {
        Laptop laptop = new Laptop();
        Random random = new Random(System.currentTimeMillis());
        int model = random.nextInt(NUMBER_OF_MODELS);
        laptop.setBrand(BRAND);
        laptop.setModel(LAPTOPS[model]);
        laptop.setPrice(LAPTOP_PRICES[model]);
        laptop.setScreenSize(LAPTOP_SIZES[model]);
        laptop.setTouchScreen(TOUCHSCREEN);
        return laptop;
    }

    public static Phone createPhone() {
        Phone phone = new Phone();
        Random random = new Random(System.currentTimeMillis());
        int model = random.nextInt(NUMBER_OF_MODELS);
        phone.setBrand(BRAND);
        phone.setModel(PHONES[model]);
        phone.setPrice(PHONE_PRICES[model]);
        phone.setScreenSize(PHONE_SIZES[model]);
        phone.setFingerprintScanner(FINGERPRINT);
        return phone;
    }

    public static Watch createWatch() {
        Watch watch = new Watch();
        Random random = new Random(System.currentTimeMillis());
        int model = random.nextInt(NUMBER_OF_MODELS);
        watch.setBrand(BRAND);
        watch.setModel(WATCHES[model]);
        watch.setPrice(WATCH_PRICES[model]);
        watch.setScreenSize(WATCH_SIZES[model]);
        watch.setPulsometer(PULSOMETER);
        return watch;
    }

    public static Tablet createTablet() {
        Tablet tablet = new Tablet();
        Random random = new Random(System.currentTimeMillis());
        int model = random.nextInt(NUMBER_OF_MODELS);
        tablet.setBrand(BRAND);
        tablet.setModel(TABLETS[model]);
        tablet.setPrice(TABLET_PRICES[model]);
        tablet.setScreenSize(TABLET_SIZES[model]);
        tablet.setStylus(STYLUS[model]);
        return tablet;
    }

}
