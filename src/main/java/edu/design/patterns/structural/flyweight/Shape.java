package edu.design.patterns.structural.flyweight;

import java.awt.*;

/**
 * Created by vbrenister on 7/10/2017.
 */
public interface Shape {
    void draw(Graphics g, int x, int y, int width, int height, Color color);
}
