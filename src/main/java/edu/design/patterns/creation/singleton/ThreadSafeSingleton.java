package edu.design.patterns.creation.singleton;

/**
 * Thread safe and lazy singleton.
 * Use double check locking on instance initialization in order to
 * reduce `synchronized` performance issues.
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }
}
