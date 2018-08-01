package com.factory.abstractfactory.store;

import com.factory.abstractfactory.pizza.Pizza;

public abstract class Store {
    Pizza pizza;

    public Pizza orderPizza(String type){
        createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();

        return pizza;
    }

    public abstract void createPizza(String type);
}
