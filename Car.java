package com.variables.variables01.abstractFactory;

public class Car extends VehicleAFactory {
    @Override
    public IWheel createWheel() {
        return new CarWheel();
    }

    @Override
    public ISeating createSeating() {
        return new CarSeating();
    }
}
