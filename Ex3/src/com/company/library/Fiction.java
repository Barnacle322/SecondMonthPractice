package com.company.library;

public class Fiction extends Department{
    public Fiction() {
    }

    @Override
    public String getBookQuantity() {
        String msg = "There are " + list.toArray().length + " books in a fiction dep" ;
        return msg;
    }

    @Override
    public String toString() {
        String type = "Fiction";
        return String.format("This a %s department, there are %s books available ", type, super.getBookQuantity());
    }
}
