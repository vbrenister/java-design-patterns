package edu.design.patterns.behaviour.mediator;

/**
 * Created by vbrenister on 7/10/2017.
 */
abstract public class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}
