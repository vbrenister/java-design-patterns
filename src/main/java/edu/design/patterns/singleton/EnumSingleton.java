package edu.design.patterns.singleton;

/**
 * Cannot be destroyed by reflection.
 * Lazy evaluation is not possible.
 */
public enum EnumSingleton {
    INSTANCE;

    public void print() {
        System.out.println("Hello");
    }
}
