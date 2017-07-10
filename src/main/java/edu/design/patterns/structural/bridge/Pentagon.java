package edu.design.patterns.structural.bridge;

/**
 * Created by vbrenister on 7/10/2017.
 */
public class Pentagon extends Shape {
    public Pentagon(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();
    }
}
