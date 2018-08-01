package com.factory.abstractfactory.store;

import com.factory.abstractfactory.pizza.Pizza;

public abstract class Store {
    Pizza pizza;

    public Pizza orderPizza(){
        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();

        return pizza;
    }
}
