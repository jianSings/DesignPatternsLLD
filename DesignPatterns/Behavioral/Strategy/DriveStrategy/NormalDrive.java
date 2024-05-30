package DesignPatterns.Behavioral.Strategy.DriveStrategy;

public class NormalDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("This is a normal drive strategy");
    }
}
