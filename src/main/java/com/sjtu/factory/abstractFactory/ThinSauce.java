package com.sjtu.factory.abstractFactory;

public class ThinSauce implements Sauce {
    String sauce;

    public ThinSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "ThinSauce{" +
                "sauce='" + sauce + '\'' +
                '}';
    }
}
