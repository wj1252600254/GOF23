package com.sjtu.adapter;

public class TurkeyAdapterClass implements Turkey, Duck {
    @Override
    public void quack() {
        System.out.println("Ziiiii");
    }

    @Override
    public void gobble() {
        System.out.println("Liiiiii");
    }

    @Override
    public void fly() {
        System.out.println("I'm sliding");
    }
}
