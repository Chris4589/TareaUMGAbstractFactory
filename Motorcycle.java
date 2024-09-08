package com.variables.variables01.abstractFactory;

public class Motorcycle extends VehicleAFactory {
    @Override
    public IWheel createWheel() {
        return new MotorcycleWheel();
    }

    @Override
    public ISeating createSeating() {
        return new MotorcycleSeating();
    }
}
