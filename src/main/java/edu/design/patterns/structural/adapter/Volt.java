package edu.design.patterns.structural.adapter;

/**
 * Created by vbrenister on 7/7/2017.
 */
public class Volt {

    private int volts;

    public Volt(int volts) {
        this.volts = volts;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
}
