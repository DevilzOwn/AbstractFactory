package com.factory.abstractfactory.cheese;

public abstract class Cheese {
    String name = "Cheese";

    @Override
    public String toString(){
        return "Cheese: " + name;
    }
}
