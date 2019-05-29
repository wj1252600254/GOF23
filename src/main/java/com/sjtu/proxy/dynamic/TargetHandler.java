package com.sjtu.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TargetHandler implements InvocationHandler {
    A a;

    public TargetHandler(A a) {
        this.a = a;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass());
        method.invoke(a, args);
        return null;
    }
}
