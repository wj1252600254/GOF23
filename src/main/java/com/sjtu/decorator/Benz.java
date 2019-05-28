package com.sjtu.decorator;

public class Benz extends Car {
    public Benz() {
        description = "Benz";
    }

    @Override
    public double cost() {
        return 20;
    }
}
