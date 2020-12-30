package com.company.pizza;

public class LaFinta extends Pizza {
    private boolean hasShrooms;

    public LaFinta(int price, int weight, String cookTime, boolean hasShrooms) {
        super(price, weight, cookTime);
        this.hasShrooms = hasShrooms;
    }

    public String send() {
        return super.send();
    }

    public String toString() {
        String var10000 = super.toString();
        return "You have chosen La Finta. " + var10000 + " and " + (this.hasShrooms ? "it has mushrooms" : "it doesn't have mushrooms");
    }
}
