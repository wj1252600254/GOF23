package com.sjtu.factory.abstractFactory;

import com.sjtu.factory.abstractFactory.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        IngredientFactory ingredientFactory = new NYIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new NYCheesePizza(ingredientFactory);
            pizza.setName("NYCheesePizza");
        }
        return pizza;
    }
}
