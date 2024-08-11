package com.ashokit.java17.switchenhancements;

public class GuardedPatternDemo {

    public static void guardedPatternDemo(Object obj){
        switch (obj) {
            case String s when s.length() > 5 -> System.out.println("Long string: " + s);
            case String s -> System.out.println("Short string: " + s);
            default -> System.out.println("Not a string");
        }
    }

    public static void guardedPattern(Rectangle rectangle){
        switch (rectangle) {
            case Rectangle p when rectangle.getHeight() < 10 -> System.out.println("Height Of Rectangle:::" + rectangle.getHeight());
            case Rectangle p when rectangle.getWidth() > 10 && rectangle.getHeight() >10 -> System.out.println("Rectangle Measurements: " + p.getWidth() * p.getHeight());
            default -> System.out.println("Not a Rectangle");
        }
    }

    public static void main(String[] args) {
        guardedPatternDemo("Hai");
        guardedPatternDemo("Welcome To AshokIT");
        System.out.println();
        Rectangle rectangle = new Rectangle(25,25);
        guardedPattern(rectangle);
        Rectangle rectangle1 = new Rectangle(25,9);
        guardedPattern(rectangle1);

    }
}
