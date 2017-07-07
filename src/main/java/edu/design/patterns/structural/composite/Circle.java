package edu.design.patterns.structural.composite;

/**
 * Created by vbrenister on 7/7/2017.
 */
public class Circle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing circle with color " + fillColor);
    }
}
