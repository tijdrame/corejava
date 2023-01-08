package com.emard.java17.switchpattern;

public class SwitchPatternDemo {
    public static double getPerimeter(Shape shape){
        if(shape instanceof Circle c){
            return 2 * Math.PI * c.radius();
        }else if(shape instanceof Rectangle r){
            return (r.length()+r.width())*2;
        }else {
            throw new IllegalArgumentException();
        }
    }
    public static double getPerimeterSwitch(Shape shape){
        return switch (shape) {
            case Circle c -> 2 * Math.PI * c.radius();
            case Rectangle r -> (r.length()+r.width())*2;
            default -> throw new IllegalArgumentException();
        };
    }
    public static void testNullSupport(Object obj){
        switch (obj){
            case String s -> System.out.println(s);
            case null -> System.out.println("Unknown");
            default -> System.out.println("Default");
        }
    }
    public static void main(String[] args) {
        System.out.println(getPerimeterSwitch(new Circle(10)));
        testNullSupport(null);
    }
}
