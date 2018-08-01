package com.factory.abstractfactory.store;

import com.factory.abstractfactory.pizza.CaliforniaCheesePizza;

public class CaliforniaPizzaStore extends Store{
    public CaliforniaPizzaStore(){
        this.pizza = new CaliforniaCheesePizza();
    }
}
