package com.company.pizza;

class Pizza { //Убрал модификатор, чтобы класс не был доступен в мейне
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
        String msg = String.format("The pizza is going to be cooked for %s",cookTime);
        return msg;
    }

    @Override
    public String toString() {
        String msg = String.format("It weighs grams %s and costs %s som", weight, price);
        return msg;
    }

    public String send() {
        return toString();
    }
}
