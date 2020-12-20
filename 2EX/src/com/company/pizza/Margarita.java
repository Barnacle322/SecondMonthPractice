package com.company.pizza;

public class Margarita extends Pizza {
    private boolean isMeaty;

    public Margarita(int price, int weight, String cookTime, boolean isMeaty) {
        super(price, weight, cookTime);
        this.isMeaty = isMeaty;
    }

    public String send() {
        return super.send();
    }

    public String toString() {
        String var10000 = super.toString();
        return "You have chosen Margarita. " + var10000 + " and " + (this.isMeaty ? "it has meat" : "it doesn't have meat");
    }
}
