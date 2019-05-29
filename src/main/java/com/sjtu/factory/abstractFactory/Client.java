package com.sjtu.factory.abstractFactory;

public class Client {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        pizza.toString();
    }
}
