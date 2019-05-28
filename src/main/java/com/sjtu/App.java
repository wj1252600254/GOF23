package com.sjtu;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("2");
        arrayList.add(3);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).getClass());
        }
    }
}
