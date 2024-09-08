package com.variables.variables01.abstractFactory;

public class MotorcycleWheel implements IWheel {
    @Override
    public void countWheel() {
        System.out.println("La motocicleta tiene 2 ruedas");
    }
}
