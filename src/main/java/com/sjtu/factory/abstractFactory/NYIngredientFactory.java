package com.sjtu.factory.abstractFactory;

public class NYIngredientFactory implements IngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickDough("ThickDough");
    }

    @Override
    public Sauce createSauce() {
        return new ThinSauce("ThinSauce");
    }
}
