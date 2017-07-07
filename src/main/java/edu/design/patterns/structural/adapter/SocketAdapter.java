package edu.design.patterns.structural.adapter;

/**
 * Created by vbrenister on 7/7/2017.
 */
public interface SocketAdapter {

    Volt get120Volt();

    Volt get12Volt();

    Volt get3Volt();
}
