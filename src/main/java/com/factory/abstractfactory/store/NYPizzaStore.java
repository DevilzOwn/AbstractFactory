package com.factory.abstractfactory.store;

import com.factory.abstractfactory.factories.CaliforniaPizzaFactory;
import com.factory.abstractfactory.factories.NYPizzaFactory;
import com.factory.abstractfactory.pizza.CheesePizza;
import com.factory.abstractfactory.pizza.ClamPizza;
import com.factory.abstractfactory.pizza.PeperoniPizza;
import com.factory.abstractfactory.pizza.VeggiePizza;

public class NYPizzaStore extends Store {
    @Override
    public void createPizza(String type) {
        switch (type){
            case "cheese":
                this.pizza = new CheesePizza(new NYPizzaFactory());
                break;
            case "clam":
                this.pizza = new ClamPizza(new NYPizzaFactory());
                break;
            case "peperoni":
                this.pizza = new PeperoniPizza(new NYPizzaFactory());
                break;
            case "veggie":
                this.pizza = new VeggiePizza(new NYPizzaFactory());
                break;
        }
    }
}
