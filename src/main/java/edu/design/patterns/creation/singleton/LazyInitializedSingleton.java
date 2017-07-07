package edu.design.patterns.creation.singleton;

/**
 * Is initialized only on first access.
 * Good on single threaded environment.
 * May destroy singleton principle on multi-threaded environment.
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
