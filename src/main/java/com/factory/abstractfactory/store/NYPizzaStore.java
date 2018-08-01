package com.factory.abstractfactory.store;

import com.factory.abstractfactory.pizza.NYCheesePizza;

public class NYPizzaStore extends Store {
    public NYPizzaStore(){
        this.pizza = new NYCheesePizza();
    }
}
