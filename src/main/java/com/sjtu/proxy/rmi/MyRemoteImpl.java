package com.sjtu.proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    @Override
    public String say() throws RemoteException {
        return "hello";
    }

    public MyRemoteImpl() throws RemoteException {
    }

    public static void main(String[] args) {
        method1();
    }


    public static void method1() {
        try {
            MyRemote service = new MyRemoteImpl();
            Registry registry = LocateRegistry.createRegistry(6666);
            registry.rebind("hello", service);
            System.out.println("success");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static void method2() {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("//127.0.0.1:6666/hello", service);
            System.out.println("success");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
