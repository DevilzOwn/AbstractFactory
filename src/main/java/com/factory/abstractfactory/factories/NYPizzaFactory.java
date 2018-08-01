package com.factory.abstractfactory.factories;

import com.factory.abstractfactory.cheese.Cheese;
import com.factory.abstractfactory.cheese.MozerellaCheese;
import com.factory.abstractfactory.clams.Clam;
import com.factory.abstractfactory.clams.FreshClam;
import com.factory.abstractfactory.dough.Dough;
import com.factory.abstractfactory.dough.ThinCrust;
import com.factory.abstractfactory.sauce.Sauce;
import com.factory.abstractfactory.sauce.TomatoSauce;

public class NYPizzaFactory implements PizzaAbstractFactory {
    @Override
    public Cheese createCheese() {
        return new MozerellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }

    @Override
    public Dough createDough() {
        return new ThinCrust();
    }
}
