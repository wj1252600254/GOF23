package com.sjtu.factory.abstractFactory;

public interface IngredientFactory {
    public Dough createDough();

    public Sauce createSauce();
}
