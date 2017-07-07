package edu.design.patterns.singleton;

/**
 * Is initialized even if instance is not used.
 * Good if singleton do not use a lof of resources.
 * Doesn't provide exception handling.
 */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
