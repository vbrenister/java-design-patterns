package edu.design.patterns.structural.bridge;

/**
 * Created by vbrenister on 7/10/2017.
 */
abstract public class Shape {
    // Composition - implementor
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
