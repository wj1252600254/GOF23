package com.sjtu.observer;

public class Peacer implements Observer, DisplayElement {
    private Observable observable;
    private String peace;

    public Peacer(Observable observable) {
        this.observable = observable;
        observable.registerObserver(this);
    }

    @Override
    public void diapaly() {
        System.out.println("Peace is:" + peace);
    }

    @Override
    public void update(String love, String peace) {
        this.peace = peace;
        diapaly();
    }
}
