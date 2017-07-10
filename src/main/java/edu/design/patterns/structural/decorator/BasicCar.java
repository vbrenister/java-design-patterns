package edu.design.patterns.structural.decorator;

/**
 * Created by vbrenister on 7/10/2017.
 */
public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.print("Basic car.");
    }
}
