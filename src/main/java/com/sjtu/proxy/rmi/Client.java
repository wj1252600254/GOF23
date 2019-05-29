package com.sjtu.proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {

        new Client().go1();
        new Client().go();
    }

    public void go() {
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6666);
            MyRemote service = (MyRemote) registry.lookup("hello");
            System.out.println(service.say());
            System.out.println("end");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void go1() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://localhost:6666/hello");
            System.out.println(service.say());
            System.out.println("end");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
