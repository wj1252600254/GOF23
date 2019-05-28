package com.sjtu.observer;

import java.util.ArrayList;

public class News implements Observable {
    ArrayList<Observer> arrayList;
    private String love;
    private String peace;

    public News() {
        this.arrayList = new ArrayList<>();
    }


    public void setNews(String love, String peace) {
        this.love = love;
        this.peace = peace;
        stateChanged();
    }

    public void setLove(String love) {
        this.love = love;
        stateChanged();
    }


    public void setPeace(String peace) {
        this.peace = peace;
        stateChanged();
    }

    private void stateChanged() {
        notifyObserver();
    }


    @Override
    public void registerObserver(Observer observer) {
        arrayList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        arrayList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : arrayList) {
            observer.update(love, peace);
        }
    }
}
