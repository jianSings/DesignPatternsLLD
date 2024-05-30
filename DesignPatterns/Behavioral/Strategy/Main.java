package DesignPatterns.Behavioral.Strategy;

public class Main {

    public static void main(String[] args) {
        Vehicle sportsVehicle = new SportsVehicle();
        Vehicle offRoadVehicle = new OffRoadVehicle();
        Vehicle goodsVehicle = new GoodsVehicle();
        sportsVehicle.drive();
        offRoadVehicle.drive();
        goodsVehicle.drive();
    }

}
