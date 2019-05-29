package com.sjtu.adapter;

public class Client {
    public static void main(String[] args) {
        Duck duck = new TurkeyAdapterObject(new WildTurkey());
        duck.quack();
        duck.fly();

        Duck duck1 = new TurkeyAdapterClass();
        duck1.quack();
        duck1.fly();
    }
}
