package com.sjtu.strategy;

public class HeheDuck extends Duck{

    public HeheDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void dispaly() {
        System.out.println("I'm heheDuck");
    }
}
