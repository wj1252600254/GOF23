package com.sjtu.factory.abstractFactory;

public class ThickDough implements Dough {
    String thick;

    public ThickDough(String thick) {
        this.thick = thick;
    }

    @Override
    public String toString() {
        return "ThickDough{" +
                "thick='" + thick + '\'' +
                '}';
    }
}
