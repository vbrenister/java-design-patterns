package edu.design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	private static final Map<ShapeType, Shape> shapes = new HashMap<>();
	
	public static Shape getShape(ShapeType type) {
		Shape shapeImpl = shapes.computeIfAbsent(type, t -> {
			switch(t) {
				case OVAL_FILL: return new Oval(true);
				case OVAL_NOFILL: return new Oval(false);
				case LINE: return new Line();
				default: throw new IllegalArgumentException("Invalid shape type");
			}
		});
		
		return shapeImpl;
	}
	
	public static enum ShapeType {
		OVAL_FILL,OVAL_NOFILL,LINE;
	}
}
