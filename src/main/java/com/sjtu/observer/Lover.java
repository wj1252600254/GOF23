package com.sjtu.observer;

public class Lover implements Observer, DisplayElement {
    Observable observable;
    private String love;

    public Lover(Observable observable) {
        this.observable = observable;
        observable.registerObserver(this);
    }

    @Override
    public void diapaly() {
        System.out.println("Love is: " + love);
    }

    @Override
    public void update(String love, String peace) {
        this.love = love;
        diapaly();
    }
}
