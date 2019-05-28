package com.sjtu.decorator;

public class Client {
    public static void main(String[] args) {
        Car car = new Benz();
        car = new BenzWheel(car);
        car = new BenzWheel(car);
        System.out.println(car.getDescription() +"   :"+ car.cost());
    }
}
