package com.sjtu.template;

public abstract class Beverage {
    final void prepare() {
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling Water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
