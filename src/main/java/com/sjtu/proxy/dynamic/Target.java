package com.sjtu.proxy.dynamic;

public class Target implements A {
    @Override
    public void say() {
        System.out.println("Hello");
    }
}
