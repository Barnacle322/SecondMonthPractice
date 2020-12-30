package com.company.library;

public class Technical extends Department{
    private boolean hasComputer;

    public Technical() {
    }

    public Technical(boolean hasComputer) {
        this.hasComputer = hasComputer;
    }

    @Override
    public String getBookQuantity() {
        String msg = "There are " + list.toArray().length + " books in a technical dep" ;
        return msg;
    }

    @Override
    public String toString() {
        String type = "Technical";
        return String.format("This a %s department, there are %s books available. This room %s ", type, super.getBookQuantity(), (hasComputer? "also has a computer": "doesn't have a computer"));
    }
}
