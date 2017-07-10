package edu.design.patterns.behaviour.mediator;

/**
 * Created by vbrenister on 7/10/2017.
 */
public class UserImpl extends User {
    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + ": Sending message=" + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": Received message:" + msg);
    }
}
