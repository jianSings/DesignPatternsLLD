package DesignPatterns.Behavioral.Strategy;

import DesignPatterns.Behavioral.Strategy.DriveStrategy.DriveStrategy;

public class Vehicle {
    private DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        this.driveStrategy.drive();
    }
}
