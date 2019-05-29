package com.sjtu.factory.abstractFactory;

public class ThickSauce implements Sauce {
    String sauce;

    public ThickSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "ThickSauce{" +
                "sauce='" + sauce + '\'' +
                '}';
    }
}
