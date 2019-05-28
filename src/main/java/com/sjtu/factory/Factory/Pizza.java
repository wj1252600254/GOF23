package com.sjtu.factory.Factory;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> arrayList = new ArrayList<>();

    public void prepare() {
        System.out.println("Pizza is preparing!");
        for (String s : arrayList) {
            System.out.println("    " + s);
        }
    }

    public void bake() {
        System.out.println("Pizza is baking!");
    }

    public void cut() {
        System.out.println("Pizza is cutting!");
    }

    public void box() {
        System.out.println("Pizza is boxing!");
    }
}
