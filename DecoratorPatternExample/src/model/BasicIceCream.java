package model;

import interfaces.IceCream;

public class BasicIceCream implements IceCream {

    public BasicIceCream() {
        System.out.println("Creating a Basic Ice-cream!");
    }

    @Override
    public double cost() {
        return 0.50;
    }
}
