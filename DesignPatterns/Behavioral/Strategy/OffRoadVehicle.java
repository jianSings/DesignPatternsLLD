package DesignPatterns.Behavioral.Strategy;

import DesignPatterns.Behavioral.Strategy.DriveStrategy.SpecialDrive;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new SpecialDrive());
    }

}
