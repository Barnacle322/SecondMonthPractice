package com.company;

public class Circle {
    private int radius;
    private static int counter;
    final double pi = 3.14;


    public Circle(int radius) {
        this.radius = radius;
        if ((Math.round(pi * Math.pow(radius, 2)) % 3) == 0) {
            counter++;
        }
    }

    public int getRadius() {
        return radius;
    }

    public static int getCounter() {
        return counter;
    }
}
