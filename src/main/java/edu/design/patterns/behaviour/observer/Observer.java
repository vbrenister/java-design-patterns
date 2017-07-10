package edu.design.patterns.behaviour.observer;

/**
 * Created by vbrenister on 7/10/2017.
 */
public interface Observer {
    void update();
    void setSubject(Subject sub);
}
