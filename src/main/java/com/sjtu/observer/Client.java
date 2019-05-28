package com.sjtu.observer;

public class Client {
    public static void main(String[] args) {
        News observable = new News();
        Lover lover = new Lover(observable);
        Peacer peacer = new Peacer(observable);
        System.out.println("Test begin");


        observable.setNews("aa", "bb");
        observable.setLove("1234567");
        observable.setPeace("7654321");
    }
}
