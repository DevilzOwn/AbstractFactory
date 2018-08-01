package com.factory.abstractfactory.factories;

import com.factory.abstractfactory.cheese.CheddarCheese;
import com.factory.abstractfactory.cheese.Cheese;
import com.factory.abstractfactory.clams.Clam;
import com.factory.abstractfactory.clams.FrozenClam;
import com.factory.abstractfactory.dough.Dough;
import com.factory.abstractfactory.dough.ThinCrust;
import com.factory.abstractfactory.sauce.ChillySauce;
import com.factory.abstractfactory.sauce.Sauce;

public class CaliforniaPizzaFactory implements PizzaAbstractFactory {

    @Override
    public Cheese createCheese() {
        return new CheddarCheese();
    }

    @Override
    public Sauce createSauce() {
        return new ChillySauce();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }

    @Override
    public Dough createDough() {
        return new ThinCrust();
    }
}
