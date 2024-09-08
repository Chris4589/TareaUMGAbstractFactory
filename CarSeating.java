package com.variables.variables01.abstractFactory;

public class CarSeating implements ISeating {
    @Override
    public void countSeating() {
        System.out.println("El carro tiene 4 asientos");
    }
}
