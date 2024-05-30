package DesignPatterns.Behavioral.Strategy.DriveStrategy;

public class SpecialDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("This is special drive strategy");
    }
}
