package by.epam.preTraining.alexdyagel.tasks.task07.controller;

import by.epam.preTraining.alexdyagel.tasks.task07.logic.StoreManager;
import by.epam.preTraining.alexdyagel.tasks.task07.model.container.LimitedGadgetsStore;
import by.epam.preTraining.alexdyagel.tasks.task07.model.container.UnlimitedGadgetsStore;
import by.epam.preTraining.alexdyagel.tasks.task07.model.entity.Laptop;
import by.epam.preTraining.alexdyagel.tasks.task07.model.entity.Phone;
import by.epam.preTraining.alexdyagel.tasks.task07.model.entity.Tablet;
import by.epam.preTraining.alexdyagel.tasks.task07.model.entity.Watch;

import java.util.Random;

public class XiaomiStoreCreator {

    private static final String BRAND = "Xiaomi";
    private static final int NUMBER_OF_GADGETS = 4;
    private static final int NUMBER_OF_MODELS = 3;

    private static final String[] LAPTOPS = {"Mi Notebook Pro", "Mi Notebook Air", "Mi Notebook 1"};
    private static final double[] LAPTOP_PRICES = {1000, 1100, 1500};
    private static final double[] LAPTOP_SIZES = {15.6, 13.3, 17.2};
    private static final boolean[] TOUCHSCREEN = {false, true, true};

    private static final String[] PHONES = {"Redmi Note 5", "Mi MIX 2S", "Mi Max 2"};
    private static final double[] PHONE_PRICES = {275, 800, 700};
    private static final double[] PHONE_SIZES = {5.8, 4.7, 4.7};
    private static final boolean FINGERPRINT = true;

    private static final String[] WATCHES = {"Mi Band 1s", "Mi Band 2s", "Mi Band 3s"};
    private static final double[] WATCH_PRICES = {10, 20, 30};
    private static final double[] WATCH_SIZES = {0.5, 0.5, 0.5};
    private static final boolean PULSOMETER = true;

    private static final String[] TABLETS = {"Mi Tablet 1", "Mi Tablet 2", "Mi Tablet 3"};
    private static final double[] TABLET_PRICES = {100, 150, 200};
    private static final double[] TABLET_SIZES = {10.5, 9.0, 7.0};
    private static final boolean[] STYLUS = {true, true, true};


    public static UnlimitedGadgetsStore createStore(int numberOfGadgets, String storeName) {
        if (numberOfGadgets < 1) {
            return null;
        }
        Random random = new Random(System.currentTimeMillis());
        UnlimitedGadgetsStore store = new UnlimitedGadgetsStore();
        store.setName(storeName);
        int gadgetNumber;
        for (int i = 0; i < numberOfGadgets; i++) {
            gadgetNumber = random.nextInt(NUMBER_OF_GADGETS);
            switch (gadgetNumber) {
                case 0:
                    StoreManager.add(store, createLaptop());
                    break;
                case 1:
                    StoreManager.add(store, createWatch());
                    break;
                case 2:
                    StoreManager.add(store, createTablet());
                    break;
                case 3:
                    StoreManager.add(store, createPhone());
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
        laptop.setTouchScreen(TOUCHSCREEN[model]);
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
