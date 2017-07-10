package edu.design.patterns.structural.bridge;

/**
 * Created by vbrenister on 7/10/2017.
 */
public class BridgePatternTest {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}
