package com.company.pizza;

public class Pepperoni extends Pizza {
    private boolean isSpicy;

    public Pepperoni(int price, int weight, String cookTime, boolean isSpicy) {
        super(price, weight, cookTime);
        this.isSpicy = isSpicy;
    }

    public String send() {
        return super.send();
    }

    public String toString() {
        String var10000 = super.toString();
        return "You have chosen Pepperoni. " + var10000 + " and " + (this.isSpicy ? "it is spicy" : "it's not spicy");
    }
}
