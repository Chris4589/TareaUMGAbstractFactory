package com.variables.variables01.abstractFactory;

public class MotorcycleSeating implements ISeating {
    @Override
    public void countSeating() {
        System.out.println("La motocicleta tiene 2 asientos");
    }
}
