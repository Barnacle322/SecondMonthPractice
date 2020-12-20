package com.company.pizza;

class Pizza {
    private int price;
    private int weight;
    private String cookTime;

    public Pizza() {
    }

    public Pizza(int price, int weight, String cookTime) {
        this.price = price;
        this.weight = weight;
        this.cookTime = cookTime;
    }

    public String getCookTime() {
        String msg = String.format("The pizza is going to be cooked for %s", this.cookTime);
        return msg;
    }

    public String toString() {
        String msg = String.format("It weighs grams %s and costs %s som", this.weight, this.price);
        return msg;
    }

    public String send() {
        return this.toString();
    }
}