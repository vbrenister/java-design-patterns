package edu.design.patterns.structural.bridge;

/**
 * Created by vbrenister on 7/10/2017.
 */
public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("red. ");
    }
}
