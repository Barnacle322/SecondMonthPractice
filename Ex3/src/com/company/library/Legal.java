package com.company.library;

public class Legal extends Department{

    public Legal() {
    }

    @Override
    public String getBookQuantity() {
        String msg = "There are " + list.toArray().length + " books in a legal dep" ;
        return msg;
    }

    @Override
    public String toString() {
        String type = "Legal";
        return String.format("This a %s department, there are %s books available ", type, super.getBookQuantity());
    }
}
