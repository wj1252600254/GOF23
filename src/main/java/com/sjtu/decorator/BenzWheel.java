package com.sjtu.decorator;

public class BenzWheel extends CondimentDecorator {
    Car car;

    public BenzWheel(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription()+",BeanzWheel";
    }

    @Override
    public double cost() {
        return car.cost()+5.2;
    }
}
