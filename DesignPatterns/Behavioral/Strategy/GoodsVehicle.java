package DesignPatterns.Behavioral.Strategy;

import DesignPatterns.Behavioral.Strategy.DriveStrategy.NormalDrive;

public class GoodsVehicle extends Vehicle {

    GoodsVehicle() {
        super(new NormalDrive());
    }
}
