package com.factory.abstractfactory.factories;

import com.factory.abstractfactory.cheese.Cheese;
import com.factory.abstractfactory.clams.Clam;
import com.factory.abstractfactory.dough.Dough;
import com.factory.abstractfactory.sauce.Sauce;

public interface PizzaAbstractFactory {
    public Cheese createCheese();
    public Sauce createSauce();
    public Clam createClam();
    public Dough createDough();
}
