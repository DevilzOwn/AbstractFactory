package com.factory.abstractfactory.store;

import com.factory.abstractfactory.factories.CaliforniaPizzaFactory;
import com.factory.abstractfactory.pizza.CheesePizza;
import com.factory.abstractfactory.pizza.ClamPizza;
import com.factory.abstractfactory.pizza.PeperoniPizza;
import com.factory.abstractfactory.pizza.VeggiePizza;

public class CaliforniaPizzaStore extends Store{

    @Override
    public void createPizza(String type) {
        switch (type){
            case "cheese":
                this.pizza = new CheesePizza(new CaliforniaPizzaFactory());
                break;
            case "clam":
                this.pizza = new ClamPizza(new CaliforniaPizzaFactory());
                break;
            case "peperoni":
                this.pizza = new PeperoniPizza(new CaliforniaPizzaFactory());
                break;
            case "veggie":
                this.pizza = new VeggiePizza(new CaliforniaPizzaFactory());
                break;
        }
    }
}
