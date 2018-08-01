package com.factory.abstractfactory.pizza;

import com.factory.abstractfactory.factories.CaliforniaPizzaFactory;
import com.factory.abstractfactory.factories.PizzaAbstractFactory;

public class CaliforniaCheesePizza extends Pizza {
    PizzaAbstractFactory factory;

    public CaliforniaCheesePizza(){
        factory = new CaliforniaPizzaFactory();
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
