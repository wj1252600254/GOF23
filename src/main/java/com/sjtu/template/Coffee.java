package com.sjtu.template;

public class Coffee extends Beverage {
    @Override
    void brew() {
        System.out.println("Coffee bew");
    }

    @Override
    void addCondiments() {
        System.out.println("Coffeee add");
    }
}
