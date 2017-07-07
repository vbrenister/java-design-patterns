package edu.design.patterns.creation.singleton;

/**
 * JVM wont see any static `members` in the `BillPughSingleton` class and will initialize it trivially.
 * `SingletonHelper` will be initialized only on `getInstance` call.
 * This will guarantee thread safety without synchronized blocks.
 */
public class BillPughSingleton {

    private BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
