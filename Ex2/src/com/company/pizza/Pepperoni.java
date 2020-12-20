package com.company.pizza;

public class Pepperoni extends Pizza {
    private boolean isSpicy;

    public Pepperoni(int price, int weight, String cookTime, boolean isSpicy) {
        super(price, weight, cookTime);
        this.isSpicy = isSpicy;
    }

    @Override
    public String send() {
        return super.send();
    }

    @Override
    public String toString() {
        return "You have chosen Pepperoni. " + super.toString() + " and " + (isSpicy? "it is spicy": "it's not spicy");
    }
}
