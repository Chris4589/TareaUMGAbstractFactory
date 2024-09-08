package com.variables.variables01.abstractFactory;

public class Main {
    public static void main(String[] args) {
        VehicleAFactory vehicleAFactory = new Motorcycle();
        ISeating seating = vehicleAFactory.createSeating();
        seating.countSeating();
        IWheel wheel = vehicleAFactory.createWheel();
        wheel.countWheel();

        vehicleAFactory = new Car();
        seating = vehicleAFactory.createSeating();
        seating.countSeating();
        wheel = vehicleAFactory.createWheel();
        wheel.countWheel();
    }
}
