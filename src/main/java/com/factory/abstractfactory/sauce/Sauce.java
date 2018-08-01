package com.factory.abstractfactory.sauce;

public abstract class Sauce {
    String name = "Sauce";

    @Override
    public String toString(){
        return "Sauce: " + name;
    }
}
