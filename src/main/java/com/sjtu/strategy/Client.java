package com.sjtu.strategy;

public class Client {
    public static void main(String[] args) {
        Duck duck=new HeheDuck(new FlyWithWings(),new Quack());
        System.out.println("test begin!!!");
        duck.fly();
        duck.quack();
        duck.dispaly();
        System.out.println("------");
        duck.setFlyBehavior(new FlyNoWay());
        duck.fly();
        duck.quack();
        duck.dispaly();
        System.out.println("------");
        duck.setQuackBehavior(new Squeak());
        duck.fly();
        duck.quack();
        duck.dispaly();
    }
}
