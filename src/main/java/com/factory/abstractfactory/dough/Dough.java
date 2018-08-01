package com.factory.abstractfactory.dough;

public abstract class Dough {
    String name = "Dough";

    @Override
    public String toString(){
        return "Dough: " + name;
    }
}
