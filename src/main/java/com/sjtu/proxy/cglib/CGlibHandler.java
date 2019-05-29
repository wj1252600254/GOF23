package com.sjtu.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGlibHandler implements MethodInterceptor {
    A a;

    public CGlibHandler(A a) {
        this.a = a;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(o.getClass());
        System.out.println(method.getName());
        System.out.println(methodProxy.getSuperName());
        System.out.println("---");
        methodProxy.invoke(a, objects);
        method.invoke(a, objects);
        return null;
    }
}
