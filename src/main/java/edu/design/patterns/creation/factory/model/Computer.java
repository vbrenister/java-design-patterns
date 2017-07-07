package edu.design.patterns.creation.factory.model;

/**
 * Created by vbrenister on 7/7/2017.
 */
abstract public class Computer {

    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}
