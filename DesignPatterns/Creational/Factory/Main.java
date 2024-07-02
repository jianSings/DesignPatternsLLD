package DesignPatternsLLD.DesignPatterns.Creational.Factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        // TODO: ADD ENUMS
        Shape squareObj = shapeFactory.getInstance("Square");
        Shape rectangleObj = shapeFactory.getInstance("Rectangle");
        Shape circleObj = shapeFactory.getInstance("Circle");

        System.out.println(squareObj);
        System.out.println(rectangleObj);
        System.out.println(circleObj);
    }
}
