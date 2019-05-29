package com.sjtu.proxy.cglib;

public class Target implements A {
    @Override
    public void say() {
        System.out.println("Hello");
    }
}
