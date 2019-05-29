package com.sjtu.factory.abstractFactory;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    ArrayList<String> arrayList = new ArrayList<>();

    public abstract void prepare();

    public void bake() {
        System.out.println("Pizza is baking!");
    }

    public void cut() {
        System.out.println("Pizza is cutting!");
    }

    public void box() {
        System.out.println("Pizza is boxing!");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", arrayList=" + arrayList +
                '}';
    }
}
