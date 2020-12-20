package com.company.pizza;

public class LaFinta extends Pizza {
    private boolean hasShrooms;

    public LaFinta(int price, int weight, String cookTime, boolean hasShrooms) {
        super(price, weight, cookTime);
        this.hasShrooms = hasShrooms;
    }

    @Override
    public String send() {
        return super.send();
    }

    @Override
    public String toString() {
        return "You have chosen La Finta. " + super.toString() + " and " + (hasShrooms? "it has mushrooms" : "it doesn't have mushrooms");
    }
}
