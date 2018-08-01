package com.factory.abstractfactory.pizza;

import com.factory.abstractfactory.cheese.Cheese;
import com.factory.abstractfactory.clams.Clam;
import com.factory.abstractfactory.dough.Dough;
import com.factory.abstractfactory.sauce.Sauce;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pizza {
    private Sauce sauce;
    private Dough dough;
    private Clam clam;
    private Cheese cheese;
    protected String name;

    private List<String> toppings = new ArrayList<String>();

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setClam(Clam clam) {
        this.clam = clam;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }


    public void bake(){
        System.out.println("Baking the pizza for 10 mins.");
    }

    public void box(){
        System.out.println("Box into legacy Pizza boxes.");
    }

    public void print(){
        System.out.println("-------------------------------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Sauce : " + this.sauce);
        System.out.println("Dough : " + this.dough);
        System.out.println("Clam : " + this.clam);
        System.out.println("Cheese : " + this.cheese);
        System.out.println("-------------------------------------------");
    }

    public abstract void prepare();

    public abstract void cut();

}