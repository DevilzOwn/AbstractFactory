package com.factory.abstractfactory.pizza;

import com.factory.abstractfactory.factories.PizzaAbstractFactory;

public class VeggiePizza extends Pizza{
    PizzaAbstractFactory factory;

    public VeggiePizza(PizzaAbstractFactory factory){
        this.factory = factory;
        this.name = "Veggie Pizza";
    }

    @Override
    public void prepare() {
        super.setCheese(factory.createCheese());
        super.setClam(factory.createClam());
        super.setSauce(factory.createSauce());
        super.setDough(factory.createDough());
    }

    @Override
    public void cut() {
        System.out.println("Cutting Triangular Slices.");
    }
}
