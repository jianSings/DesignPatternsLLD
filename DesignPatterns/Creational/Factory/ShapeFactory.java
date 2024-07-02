package DesignPatternsLLD.DesignPatterns.Creational.Factory;

public class ShapeFactory {
    public Shape getInstance(String value) {
        switch (value) {
            case "Square":
                return new Square();
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
