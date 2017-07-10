package edu.design.patterns.behaviour.observer;

/**
 * Created by vbrenister on 7/10/2017.
 */
public interface Subject {

    void register(Observer obj);

    void unregister(Observer obj);

    void notifyObservers();

    Object getUpdate(Observer obj);

}
