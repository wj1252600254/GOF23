package com.sjtu.decorator;

public abstract class Car {
    String description = "";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
