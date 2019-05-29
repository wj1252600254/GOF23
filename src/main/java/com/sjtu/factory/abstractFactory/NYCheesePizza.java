package com.sjtu.factory.abstractFactory;

public class NYCheesePizza extends Pizza {
    IngredientFactory ingredientFactory;

    public NYCheesePizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("NYPizza");
        sauce = ingredientFactory.createSauce();
        dough = ingredientFactory.createDough();
        arrayList.add("AAAA");
    }
}
