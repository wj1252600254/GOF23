package com.sjtu.adapter;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Zizi");
    }

    @Override
    public void fly() {
        System.out.println("hhh");
    }
}
