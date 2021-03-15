package model;

import interfaces.IceCream;
import interfaces.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {
    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Mint Ice-cream!");
        return 1.50 + super.cost();
    }
}
