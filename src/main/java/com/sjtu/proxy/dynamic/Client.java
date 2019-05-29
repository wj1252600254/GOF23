package com.sjtu.proxy.dynamic;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        A a = (A) Proxy.newProxyInstance(Client.class.getClassLoader(), new Class[]{A.class}, new TargetHandler(new Target()));
        a.say();
    }
}
