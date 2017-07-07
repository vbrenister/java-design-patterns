package edu.design.patterns.singleton;

import java.io.Serializable;

/**
 * Added readResolve method in order to create deserialize objects with same hashcode.
 */
public class SerializedSingleton implements Serializable {
    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton() {
    }

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
