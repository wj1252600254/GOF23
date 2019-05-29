package com.sjtu.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Target.class);
        enhancer.setCallback(new CGlibHandler(new Target()));
        Target target = (Target) enhancer.create();
        target.say();
    }
}
