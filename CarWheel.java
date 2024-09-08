package com.variables.variables01.abstractFactory;

public class CarWheel implements IWheel {
    @Override
    public void countWheel() {
        System.out.println("El carro tiene 4 llantas");
    }
}
