package edu.design.patterns.structural.flyweight;

import java.awt.*;

/**
 * Created by vbrenister on 7/10/2017.
 */
public class Line implements Shape {

	public Line() {
		System.out.println("Creating Line object");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

    @Override
    public void draw(Graphics g, int x, int y, int width, int height, Color color) {
    	g.setColor(color);
    	g.drawLine(x, y, width, height);
    }
}
