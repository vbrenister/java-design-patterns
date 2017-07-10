package edu.design.patterns.behaviour.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vbrenister on 7/10/2017.
 */
public class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    public ChatMediatorImpl() {
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        users.forEach(u -> {
            if (u != user)
                u.receive(msg);
        });
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
