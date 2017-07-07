package edu.design.patterns.structural.adapter;

/**
 * Created by vbrenister on 7/7/2017.
 */
public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }

}
