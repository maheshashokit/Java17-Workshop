package com.ashokit.java17.switchenhancements;

public class PatternMatchingShapeProcessor {

    public static String processShape(Object shape) {
        return switch (shape) {
            case Circle c -> "Processing a circle with radius " + c.getRadius();
            case Rectangle r -> "Processing a rectangle with width " + r.getWidth() + " and height " + r.getHeight();
            case Square s -> "Processing a square with side " + s.getSide();
            default -> "Unknown shape";
        };
    }

    public static void main(String[] args) {
        Object myShape = new Circle(5.0);
        String result = processShape(myShape);
        System.out.println(result);  // Output: Processing a circle with radius 5.0
        System.out.println();
        myShape = new Rectangle(10.0d,25.0d);
        result = processShape(myShape);
        System.out.println(result);  // Output: Processing a rectangle with width 10.0 and height 25.0

    }
}
