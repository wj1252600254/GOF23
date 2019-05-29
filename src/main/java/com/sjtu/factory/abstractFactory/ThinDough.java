package com.sjtu.factory.abstractFactory;

public class ThinDough implements Dough {
    String tough;

    public ThinDough(String tough) {
        this.tough = tough;
    }

    @Override
    public String toString() {
        return "ThinDough{" +
                "tough='" + tough + '\'' +
                '}';
    }
}
