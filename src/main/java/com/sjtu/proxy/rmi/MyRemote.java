package com.sjtu.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
    String say() throws RemoteException;
}
