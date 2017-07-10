package edu.design.patterns.behaviour.mediator;

/**
 * Created by vbrenister on 7/10/2017.
 */
public interface ChatMediator {

    void sendMessage(String ms, User user);

    void addUser(User user);
}
