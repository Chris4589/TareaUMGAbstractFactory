package com.variables.variables01.abstractFactory;

public abstract class VehicleAFactory {
    abstract IWheel createWheel();
    abstract ISeating createSeating();
}
