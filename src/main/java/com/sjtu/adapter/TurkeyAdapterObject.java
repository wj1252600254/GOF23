package com.sjtu.adapter;

public class TurkeyAdapterObject implements Duck {
    Turkey turkey;

    public TurkeyAdapterObject(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
