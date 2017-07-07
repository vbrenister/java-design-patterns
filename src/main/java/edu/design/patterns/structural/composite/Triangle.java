package edu.design.patterns.structural.composite;

/**
 * Created by vbrenister on 7/7/2017.
 */
public class Triangle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing triangle with color " + fillColor);
    }
}
