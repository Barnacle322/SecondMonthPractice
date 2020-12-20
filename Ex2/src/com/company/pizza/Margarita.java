package com.company.pizza;

public class Margarita extends Pizza {
    private boolean isMeaty;

    public Margarita(int price, int weight, String cookTime, boolean isMeaty) {
        super(price, weight, cookTime);
        this.isMeaty = isMeaty;
    }

    @Override
    public String send() {
        return super.send();
    }

    @Override
    public String toString() {
        return "You have chosen Margarita. " + super.toString() + " and " + (isMeaty ? "it has meat" : "it doesn't have meat");
    }
}
