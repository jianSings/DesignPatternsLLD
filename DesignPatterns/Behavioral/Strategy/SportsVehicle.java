package DesignPatterns.Behavioral.Strategy;

import DesignPatterns.Behavioral.Strategy.DriveStrategy.SpecialDrive;

public class SportsVehicle extends Vehicle {

    SportsVehicle() {
        super(new SpecialDrive());
    }
}
